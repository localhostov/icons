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

public val Icons.Filled.Stomach: ImageVector
    get() {
        if (_stomach != null) {
            return _stomach!!
        }
        _stomach = Builder(name = "Stomach", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.0f, 3.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-1.398f, 0.0f, -2.701f, -0.967f, -3.031f, -2.249f)
                curveToRelative(-0.138f, -0.535f, -0.687f, -0.854f, -1.218f, -0.72f)
                curveToRelative(-0.535f, 0.138f, -0.857f, 0.684f, -0.72f, 1.218f)
                curveToRelative(0.478f, 1.855f, 2.07f, 3.276f, 3.969f, 3.652f)
                verticalLineToRelative(9.099f)
                curveToRelative(0.0f, 2.176f, -3.612f, 3.186f, -3.743f, 3.331f)
                curveToRelative(-1.897f, 0.711f, -3.257f, 2.527f, -3.257f, 4.669f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.305f, 0.842f, -2.406f, 2.008f, -2.818f)
                curveToRelative(0.167f, 0.104f, 0.342f, 0.21f, 0.504f, 0.312f)
                curveToRelative(2.012f, 1.275f, 3.911f, 2.479f, 8.487f, 2.505f)
                horizontalLineToRelative(0.04f)
                curveToRelative(1.835f, 0.0f, 3.568f, -0.72f, 4.886f, -2.029f)
                curveToRelative(1.338f, -1.331f, 2.075f, -3.096f, 2.075f, -4.97f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -3.859f, -3.141f, -7.0f, -7.0f, -7.0f)
                close()
                moveTo(19.915f, 12.702f)
                curveToRelative(-0.222f, 0.506f, -0.811f, 0.733f, -1.319f, 0.511f)
                curveToRelative(-0.319f, -0.142f, -0.672f, -0.213f, -1.05f, -0.213f)
                curveToRelative(-0.596f, 0.0f, -0.979f, 0.179f, -1.464f, 0.406f)
                curveToRelative(-0.566f, 0.265f, -1.271f, 0.594f, -2.311f, 0.594f)
                curveToRelative(-0.74f, 0.0f, -1.474f, -0.161f, -2.181f, -0.479f)
                curveToRelative(-0.504f, -0.226f, -0.729f, -0.817f, -0.503f, -1.321f)
                curveToRelative(0.227f, -0.503f, 0.819f, -0.729f, 1.321f, -0.503f)
                curveToRelative(0.448f, 0.201f, 0.906f, 0.303f, 1.362f, 0.303f)
                curveToRelative(0.596f, 0.0f, 0.979f, -0.179f, 1.463f, -0.405f)
                curveToRelative(0.566f, -0.266f, 1.271f, -0.595f, 2.312f, -0.595f)
                curveToRelative(0.657f, 0.0f, 1.283f, 0.129f, 1.858f, 0.383f)
                curveToRelative(0.505f, 0.224f, 0.733f, 0.814f, 0.511f, 1.319f)
                close()
            }
        }
        .build()
        return _stomach!!
    }

private var _stomach: ImageVector? = null
