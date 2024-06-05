package me.localx.icons.straight.outline

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

public val Icons.Outline.CircleBolt: ImageVector
    get() {
        if (_circleBolt != null) {
            return _circleBolt!!
        }
        _circleBolt = Builder(name = "CircleBolt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveTo(5.38f, 24.0f, 0.0f, 18.62f, 0.0f, 12.0f)
                reflectiveCurveTo(5.38f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.38f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-5.38f, 12.0f, -12.0f, 12.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(6.49f, 2.0f, 2.0f, 6.49f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.49f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.49f, 10.0f, -10.0f)
                reflectiveCurveTo(17.51f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(15.77f, 13.43f)
                curveToRelative(0.29f, -0.48f, 0.31f, -1.09f, 0.04f, -1.59f)
                curveToRelative(-0.28f, -0.52f, -0.82f, -0.85f, -1.41f, -0.85f)
                horizontalLineToRelative(-4.13f)
                lineToRelative(2.89f, -5.54f)
                lineToRelative(-1.77f, -0.92f)
                lineToRelative(-3.3f, 6.38f)
                curveToRelative(-0.15f, 0.49f, -0.05f, 1.02f, 0.25f, 1.43f)
                reflectiveCurveToRelative(0.79f, 0.65f, 1.3f, 0.65f)
                horizontalLineToRelative(4.13f)
                lineToRelative(-2.81f, 5.46f)
                lineToRelative(1.78f, 0.92f)
                lineToRelative(3.06f, -5.94f)
                close()
            }
        }
        .build()
        return _circleBolt!!
    }

private var _circleBolt: ImageVector? = null
