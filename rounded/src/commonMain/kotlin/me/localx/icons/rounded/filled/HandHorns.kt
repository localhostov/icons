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

public val Icons.Filled.HandHorns: ImageVector
    get() {
        if (_handHorns != null) {
            return _handHorns!!
        }
        _handHorns = Builder(name = "HandHorns", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 15.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(13.0f, 13.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(20.25f, 1.02f)
                curveToRelative(-0.74f, 0.12f, -1.25f, 0.81f, -1.25f, 1.56f)
                lineTo(19.0f, 13.32f)
                curveToRelative(0.0f, 1.9f, -1.44f, 3.59f, -3.34f, 3.67f)
                curveToRelative(-0.8f, 0.04f, -1.55f, -0.2f, -2.16f, -0.63f)
                curveToRelative(-0.57f, 0.4f, -1.26f, 0.63f, -2.0f, 0.63f)
                curveToRelative(-0.83f, 0.0f, -1.58f, -0.29f, -2.18f, -0.77f)
                curveToRelative(-0.02f, 0.02f, -1.82f, 1.83f, -2.44f, 2.44f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f)
                lineToRelative(2.33f, -2.33f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(0.86f, -0.86f, 0.77f, -2.3f, -0.26f, -3.05f)
                curveToRelative(-0.81f, -0.58f, -1.94f, -0.41f, -2.65f, 0.29f)
                lineToRelative(-2.69f, 2.69f)
                curveToRelative(-1.6f, 1.6f, -1.6f, 4.19f, 0.0f, 5.79f)
                lineToRelative(1.59f, 1.59f)
                curveToRelative(1.13f, 1.13f, 2.65f, 1.76f, 4.24f, 1.76f)
                horizontalLineToRelative(8.97f)
                curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f)
                lineTo(22.0f, 2.5f)
                curveToRelative(0.0f, -0.91f, -0.81f, -1.63f, -1.75f, -1.48f)
                close()
                moveTo(8.0f, 9.86f)
                lineTo(8.0f, 1.58f)
                curveTo(8.0f, 0.83f, 7.49f, 0.14f, 6.75f, 0.02f)
                curveToRelative(-0.94f, -0.15f, -1.75f, 0.57f, -1.75f, 1.48f)
                lineTo(5.0f, 9.76f)
                curveToRelative(0.97f, -0.36f, 2.05f, -0.32f, 3.0f, 0.09f)
                close()
            }
        }
        .build()
        return _handHorns!!
    }

private var _handHorns: ImageVector? = null
