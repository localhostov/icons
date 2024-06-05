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

public val Icons.Outline.InfoGuide: ImageVector
    get() {
        if (_infoGuide != null) {
            return _infoGuide!!
        }
        _infoGuide = Builder(name = "InfoGuide", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 3.978f)
                verticalLineToRelative(16.828f)
                lineToRelative(-12.0f, 2.182f)
                lineTo(0.0f, 20.807f)
                lineTo(0.0f, 3.973f)
                horizontalLineToRelative(0.0f)
                curveTo(0.0f, 3.081f, 0.393f, 2.241f, 1.078f, 1.67f)
                curveToRelative(0.685f, -0.572f, 1.582f, -0.809f, 2.459f, -0.648f)
                lineToRelative(0.463f, 0.084f)
                verticalLineToRelative(2.033f)
                lineToRelative(-0.821f, -0.149f)
                curveToRelative(-0.405f, -0.073f, -0.686f, 0.104f, -0.82f, 0.216f)
                curveToRelative(-0.134f, 0.112f, -0.359f, 0.36f, -0.359f, 0.768f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.005f, 0.0f, 0.005f)
                verticalLineToRelative(15.159f)
                lineToRelative(9.0f, 1.636f)
                verticalLineToRelative(-4.774f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.774f)
                lineToRelative(9.0f, -1.636f)
                lineTo(22.0f, 3.973f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.407f, -0.225f, -0.656f, -0.359f, -0.768f)
                curveToRelative(-0.134f, -0.111f, -0.417f, -0.288f, -0.82f, -0.216f)
                lineToRelative(-0.821f, 0.149f)
                lineTo(20.0f, 1.106f)
                lineToRelative(0.463f, -0.084f)
                curveToRelative(0.878f, -0.159f, 1.774f, 0.077f, 2.459f, 0.648f)
                curveToRelative(0.685f, 0.572f, 1.078f, 1.411f, 1.078f, 2.303f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.005f, 0.0f, 0.005f)
                close()
                moveTo(13.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(13.0f, 6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(6.0f, 9.0f)
                lineTo(6.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-0.383f)
                lineToRelative(-1.587f, 1.571f)
                curveToRelative(-0.29f, 0.284f, -0.668f, 0.426f, -1.045f, 0.426f)
                curveToRelative(-0.381f, 0.0f, -0.761f, -0.145f, -1.049f, -0.432f)
                lineToRelative(-1.556f, -1.565f)
                horizontalLineToRelative(-0.379f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                close()
                moveTo(8.0f, 9.0f)
                curveToRelative(0.0f, 0.551f, 0.449f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.211f)
                lineToRelative(1.777f, 1.788f)
                lineToRelative(1.807f, -1.788f)
                horizontalLineToRelative(1.206f)
                curveToRelative(0.551f, 0.0f, 1.0f, -0.449f, 1.0f, -1.0f)
                lineTo(16.001f, 3.0f)
                curveToRelative(0.0f, -0.551f, -0.449f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _infoGuide!!
    }

private var _infoGuide: ImageVector? = null
