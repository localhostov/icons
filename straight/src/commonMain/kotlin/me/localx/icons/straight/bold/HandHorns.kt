package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.HandHorns: ImageVector
    get() {
        if (_handHorns != null) {
            return _handHorns!!
        }
        _handHorns = Builder(name = "HandHorns", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 13.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(15.5f, 15.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(20.5f, 2.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                lineTo(19.0f, 21.0f)
                lineTo(7.09f, 21.0f)
                lineToRelative(-3.51f, -3.29f)
                lineToRelative(3.81f, -3.95f)
                curveToRelative(0.8f, -0.8f, 0.8f, -2.09f, 0.0f, -2.89f)
                curveToRelative(-0.8f, -0.8f, -2.09f, -0.8f, -2.89f, 0.0f)
                lineToRelative(-3.52f, 3.61f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.65f, 0.66f, -1.0f, 1.53f, -1.0f, 2.46f)
                reflectiveCurveToRelative(0.36f, 1.81f, 1.06f, 2.51f)
                lineToRelative(4.85f, 4.55f)
                lineTo(22.0f, 24.0f)
                lineTo(22.0f, 3.5f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(8.0f, 8.85f)
                lineTo(8.0f, 1.58f)
                curveTo(8.0f, 0.83f, 7.49f, 0.14f, 6.75f, 0.02f)
                curveToRelative(-0.94f, -0.15f, -1.75f, 0.57f, -1.75f, 1.48f)
                verticalLineToRelative(6.91f)
                curveToRelative(1.01f, -0.25f, 2.08f, -0.1f, 3.0f, 0.44f)
                close()
            }
        }
        .build()
        return _handHorns!!
    }

private var _handHorns: ImageVector? = null
