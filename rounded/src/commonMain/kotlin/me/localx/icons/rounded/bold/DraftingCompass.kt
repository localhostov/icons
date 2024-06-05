package me.localx.icons.rounded.bold

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

public val Icons.Bold.DraftingCompass: ImageVector
    get() {
        if (_draftingCompass != null) {
            return _draftingCompass!!
        }
        _draftingCompass = Builder(name = "DraftingCompass", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.788f, 21.73f)
                lineToRelative(-3.651f, -6.112f)
                curveToRelative(0.461f, -0.293f, 0.913f, -0.603f, 1.345f, -0.95f)
                curveToRelative(0.646f, -0.519f, 0.749f, -1.463f, 0.229f, -2.108f)
                curveToRelative(-0.52f, -0.647f, -1.466f, -0.748f, -2.108f, -0.23f)
                curveToRelative(-0.323f, 0.26f, -0.66f, 0.494f, -1.003f, 0.716f)
                lineToRelative(-3.089f, -5.17f)
                curveToRelative(0.302f, -0.562f, 0.489f, -1.195f, 0.489f, -1.876f)
                curveToRelative(0.0f, -1.675f, -1.036f, -3.107f, -2.5f, -3.703f)
                verticalLineToRelative(-0.797f)
                curveToRelative(0.0f, -0.829f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(0.797f)
                curveToRelative(-1.464f, 0.595f, -2.5f, 2.028f, -2.5f, 3.703f)
                curveToRelative(0.0f, 0.682f, 0.187f, 1.314f, 0.489f, 1.876f)
                lineToRelative(-3.09f, 5.172f)
                curveToRelative(-0.33f, -0.213f, -0.653f, -0.439f, -0.965f, -0.687f)
                curveToRelative(-0.645f, -0.516f, -1.591f, -0.409f, -2.107f, 0.238f)
                curveToRelative(-0.517f, 0.648f, -0.41f, 1.591f, 0.238f, 2.108f)
                curveToRelative(0.417f, 0.333f, 0.853f, 0.631f, 1.297f, 0.913f)
                lineTo(0.212f, 21.73f)
                curveToRelative(-0.425f, 0.711f, -0.192f, 1.633f, 0.519f, 2.058f)
                curveToRelative(0.241f, 0.144f, 0.507f, 0.212f, 0.769f, 0.212f)
                curveToRelative(0.51f, 0.0f, 1.008f, -0.261f, 1.289f, -0.73f)
                lineToRelative(3.766f, -6.303f)
                curveToRelative(1.747f, 0.666f, 3.594f, 1.011f, 5.445f, 1.011f)
                reflectiveCurveToRelative(3.699f, -0.345f, 5.447f, -1.011f)
                lineToRelative(3.766f, 6.303f)
                curveToRelative(0.281f, 0.47f, 0.779f, 0.73f, 1.289f, 0.73f)
                curveToRelative(0.262f, 0.0f, 0.527f, -0.068f, 0.769f, -0.212f)
                curveToRelative(0.711f, -0.425f, 0.943f, -1.347f, 0.519f, -2.058f)
                close()
                moveTo(10.5f, 6.0f)
                curveToRelative(0.0f, -0.827f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                close()
                moveTo(8.115f, 14.353f)
                lineToRelative(2.717f, -4.547f)
                curveToRelative(0.372f, 0.115f, 0.759f, 0.194f, 1.168f, 0.194f)
                reflectiveCurveToRelative(0.796f, -0.08f, 1.168f, -0.194f)
                lineToRelative(2.716f, 4.546f)
                curveToRelative(-2.513f, 0.838f, -5.255f, 0.839f, -7.768f, 0.002f)
                close()
            }
        }
        .build()
        return _draftingCompass!!
    }

private var _draftingCompass: ImageVector? = null
