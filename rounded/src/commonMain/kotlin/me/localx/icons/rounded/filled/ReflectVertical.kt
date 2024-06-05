package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.ReflectVertical: ImageVector
    get() {
        if (_reflectVertical != null) {
            return _reflectVertical!!
        }
        _reflectVertical = Builder(name = "ReflectVertical", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 13.0f)
                lineTo(1.0f, 13.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                lineTo(23.0f, 11.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(13.69f, 8.25f)
                lineToRelative(4.81f, -5.11f)
                curveToRelative(0.51f, -0.56f, 0.64f, -1.33f, 0.33f, -2.02f)
                reflectiveCurveToRelative(-0.96f, -1.12f, -1.72f, -1.12f)
                lineTo(6.88f, -0.0f)
                curveToRelative(-0.75f, 0.0f, -1.41f, 0.43f, -1.72f, 1.12f)
                reflectiveCurveToRelative(-0.18f, 1.46f, 0.34f, 2.03f)
                lineToRelative(4.79f, 5.08f)
                curveToRelative(0.44f, 0.49f, 1.06f, 0.76f, 1.71f, 0.76f)
                reflectiveCurveToRelative(1.27f, -0.28f, 1.69f, -0.75f)
                close()
                moveTo(18.84f, 22.88f)
                curveToRelative(0.3f, -0.69f, 0.18f, -1.46f, -0.34f, -2.03f)
                lineToRelative(-4.79f, -5.08f)
                curveToRelative(-0.87f, -0.97f, -2.57f, -0.95f, -3.4f, -0.02f)
                lineToRelative(-4.81f, 5.11f)
                curveToRelative(-0.51f, 0.56f, -0.64f, 1.33f, -0.33f, 2.02f)
                reflectiveCurveToRelative(0.96f, 1.12f, 1.72f, 1.12f)
                horizontalLineToRelative(10.25f)
                curveToRelative(0.75f, 0.0f, 1.41f, -0.43f, 1.72f, -1.12f)
                close()
            }
        }
        .build()
        return _reflectVertical!!
    }

private var _reflectVertical: ImageVector? = null
