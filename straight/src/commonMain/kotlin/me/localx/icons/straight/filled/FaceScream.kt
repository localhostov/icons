package me.localx.icons.straight.filled

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

public val Icons.Filled.FaceScream: ImageVector
    get() {
        if (_faceScream != null) {
            return _faceScream!!
        }
        _faceScream = Builder(name = "FaceScream", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 24.0f)
                curveToRelative(0.0f, -3.305f, -1.652f, -5.873f, -1.669f, -5.898f)
                curveToRelative(-0.603f, -0.922f, -0.349f, -2.16f, 0.57f, -2.767f)
                curveToRelative(0.92f, -0.607f, 2.099f, -0.335f, 2.763f, 0.556f)
                curveToRelative(0.102f, 0.137f, 3.336f, 3.557f, 3.336f, 8.109f)
                lineTo(2.0f, 24.0f)
                close()
                moveTo(22.004f, 24.0f)
                curveToRelative(0.0f, -3.305f, 1.652f, -5.873f, 1.669f, -5.898f)
                curveToRelative(0.603f, -0.922f, 0.349f, -2.16f, -0.57f, -2.767f)
                curveToRelative(-0.92f, -0.607f, -2.099f, -0.335f, -2.763f, 0.556f)
                curveToRelative(-0.102f, 0.137f, -3.336f, 3.557f, -3.336f, 8.109f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(15.018f, 23.602f)
                curveToRelative(-0.966f, 0.251f, -1.974f, 0.398f, -3.018f, 0.398f)
                reflectiveCurveToRelative(-2.049f, -0.147f, -3.014f, -0.397f)
                curveToRelative(-0.147f, -4.308f, -2.625f, -7.652f, -3.762f, -8.965f)
                curveToRelative(-1.256f, -1.63f, -3.391f, -2.076f, -5.119f, -1.134f)
                curveToRelative(-0.062f, -0.494f, -0.104f, -0.993f, -0.104f, -1.504f)
                curveTo(0.0f, 5.373f, 5.373f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.373f, 12.0f, 12.0f)
                curveToRelative(0.0f, 0.51f, -0.042f, 1.009f, -0.104f, 1.502f)
                curveToRelative(-1.751f, -0.951f, -3.91f, -0.484f, -5.12f, 1.14f)
                curveToRelative(-1.101f, 1.267f, -3.609f, 4.626f, -3.758f, 8.959f)
                close()
                moveTo(15.214f, 9.786f)
                curveToRelative(1.184f, 1.184f, 2.719f, 1.568f, 3.429f, 0.857f)
                curveToRelative(0.71f, -0.71f, 0.326f, -2.246f, -0.857f, -3.43f)
                curveToRelative(-1.184f, -1.184f, -2.719f, -1.568f, -3.429f, -0.857f)
                reflectiveCurveToRelative(-0.326f, 2.246f, 0.857f, 3.429f)
                close()
                moveTo(8.786f, 9.786f)
                curveToRelative(1.184f, -1.184f, 1.568f, -2.719f, 0.857f, -3.429f)
                curveToRelative(-0.71f, -0.71f, -2.246f, -0.326f, -3.429f, 0.857f)
                curveToRelative(-1.184f, 1.184f, -1.568f, 2.719f, -0.857f, 3.429f)
                curveToRelative(0.71f, 0.71f, 2.246f, 0.326f, 3.429f, -0.857f)
                close()
                moveTo(15.0f, 16.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.343f, -3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.343f, 3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _faceScream!!
    }

private var _faceScream: ImageVector? = null
