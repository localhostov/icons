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

public val Icons.Filled.CircleBolt: ImageVector
    get() {
        if (_circleBolt != null) {
            return _circleBolt!!
        }
        _circleBolt = Builder(name = "CircleBolt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.38f, 0.0f, 0.0f, 5.38f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.38f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.38f, 12.0f, -12.0f)
                reflectiveCurveTo(18.62f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(15.73f, 13.49f)
                lineToRelative(-2.86f, 5.01f)
                curveToRelative(-0.18f, 0.32f, -0.52f, 0.5f, -0.87f, 0.5f)
                curveToRelative(-0.17f, 0.0f, -0.34f, -0.04f, -0.5f, -0.13f)
                curveToRelative(-0.48f, -0.27f, -0.65f, -0.89f, -0.37f, -1.36f)
                lineToRelative(2.58f, -4.5f)
                horizontalLineToRelative(-4.09f)
                curveToRelative(-0.51f, 0.0f, -0.99f, -0.24f, -1.3f, -0.65f)
                reflectiveCurveToRelative(-0.4f, -0.94f, -0.25f, -1.43f)
                curveToRelative(0.02f, -0.07f, 0.05f, -0.14f, 0.09f, -0.21f)
                lineToRelative(2.97f, -5.21f)
                curveToRelative(0.27f, -0.48f, 0.88f, -0.65f, 1.36f, -0.37f)
                curveToRelative(0.48f, 0.27f, 0.65f, 0.88f, 0.37f, 1.36f)
                lineToRelative(-2.57f, 4.5f)
                horizontalLineToRelative(4.1f)
                curveToRelative(0.59f, 0.0f, 1.13f, 0.32f, 1.41f, 0.85f)
                reflectiveCurveToRelative(0.25f, 1.15f, -0.08f, 1.64f)
                close()
            }
        }
        .build()
        return _circleBolt!!
    }

private var _circleBolt: ImageVector? = null
