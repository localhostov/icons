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

public val Icons.Filled.FaceParty: ImageVector
    get() {
        if (_faceParty != null) {
            return _faceParty!!
        }
        _faceParty = Builder(name = "FaceParty", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.287f, 8.0f)
                horizontalLineToRelative(-0.4f)
                lineTo(0.0f, 0.0f)
                lineTo(8.0f, 0.886f)
                verticalLineToRelative(0.4f)
                curveToRelative(0.0f, 2.948f, -3.765f, 6.713f, -6.713f, 6.713f)
                close()
                moveTo(12.0f, 0.0f)
                curveToRelative(-0.683f, 0.0f, -1.348f, 0.07f, -2.0f, 0.18f)
                lineTo(10.0f, 1.287f)
                curveToRelative(0.0f, 4.071f, -4.642f, 8.713f, -8.713f, 8.713f)
                lineTo(0.18f, 10.0f)
                curveToRelative(-0.11f, 0.652f, -0.18f, 1.317f, -0.18f, 2.0f)
                curveToRelative(0.0f, 6.627f, 5.373f, 12.0f, 12.0f, 12.0f)
                curveToRelative(4.645f, 0.0f, 8.665f, -2.644f, 10.66f, -6.504f)
                curveToRelative(-0.476f, 0.317f, -1.046f, 0.504f, -1.66f, 0.504f)
                horizontalLineToRelative(-6.092f)
                curveToRelative(0.056f, 0.157f, 0.092f, 0.324f, 0.092f, 0.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                curveToRelative(0.0f, 0.176f, -0.036f, 0.343f, -0.092f, 0.5f)
                horizontalLineToRelative(6.092f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                curveToRelative(-0.274f, 0.0f, -0.53f, 0.108f, -0.721f, 0.307f)
                lineToRelative(-1.439f, -1.389f)
                curveToRelative(0.562f, -0.583f, 1.35f, -0.918f, 2.16f, -0.918f)
                curveToRelative(1.305f, 0.0f, 2.407f, 0.843f, 2.819f, 2.009f)
                curveToRelative(0.111f, -0.655f, 0.181f, -1.323f, 0.181f, -2.009f)
                curveTo(24.0f, 5.373f, 18.627f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(7.947f, 12.021f)
                curveToRelative(-1.16f, 0.0f, -2.281f, -0.48f, -3.073f, -1.265f)
                lineToRelative(1.406f, -1.422f)
                curveToRelative(0.659f, 0.653f, 2.073f, 1.186f, 3.264f, -0.017f)
                lineToRelative(1.422f, 1.406f)
                curveToRelative(-0.898f, 0.907f, -1.975f, 1.297f, -3.019f, 1.297f)
                close()
                moveTo(16.405f, 12.0f)
                curveToRelative(-0.09f, 0.006f, -0.181f, 0.009f, -0.271f, 0.009f)
                curveToRelative(-1.116f, 0.0f, -2.179f, -0.458f, -3.017f, -1.306f)
                lineToRelative(1.424f, -1.406f)
                curveToRelative(0.504f, 0.511f, 1.085f, 0.745f, 1.731f, 0.707f)
                curveToRelative(0.556f, -0.037f, 1.125f, -0.294f, 1.523f, -0.688f)
                lineToRelative(1.406f, 1.422f)
                curveToRelative(-0.742f, 0.733f, -1.762f, 1.192f, -2.798f, 1.262f)
                close()
            }
        }
        .build()
        return _faceParty!!
    }

private var _faceParty: ImageVector? = null
