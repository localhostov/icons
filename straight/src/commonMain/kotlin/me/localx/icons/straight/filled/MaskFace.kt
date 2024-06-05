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

public val Icons.Filled.MaskFace: ImageVector
    get() {
        if (_maskFace != null) {
            return _maskFace!!
        }
        _maskFace = Builder(name = "MaskFace", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.176f, 0.919f)
                curveToRelative(-1.16f, -0.87f, -2.624f, -1.137f, -4.015f, -0.736f)
                lineToRelative(-8.876f, 2.569f)
                curveToRelative(-0.42f, 0.122f, -0.859f, 0.206f, -1.301f, 0.25f)
                curveToRelative(-1.012f, 0.098f, -2.84f, 0.394f, -3.714f, 1.268f)
                reflectiveCurveToRelative(-1.168f, 2.7f, -1.268f, 3.711f)
                curveToRelative(-0.044f, 0.443f, -0.127f, 0.881f, -0.249f, 1.302f)
                lineTo(0.184f, 18.159f)
                curveToRelative(-0.403f, 1.393f, -0.135f, 2.857f, 0.737f, 4.017f)
                reflectiveCurveToRelative(2.203f, 1.824f, 3.653f, 1.824f)
                horizontalLineToRelative(6.412f)
                curveToRelative(0.18f, 0.0f, 4.468f, -0.049f, 8.717f, -4.298f)
                reflectiveCurveToRelative(4.298f, -8.537f, 4.298f, -8.718f)
                verticalLineToRelative(-6.412f)
                curveToRelative(0.0f, -1.45f, -0.665f, -2.782f, -1.824f, -3.654f)
                close()
                moveTo(18.717f, 2.107f)
                curveToRelative(0.239f, -0.069f, 0.481f, -0.104f, 0.721f, -0.104f)
                curveToRelative(0.547f, 0.0f, 1.082f, 0.177f, 1.535f, 0.517f)
                curveToRelative(0.652f, 0.489f, 1.025f, 1.238f, 1.025f, 2.052f)
                verticalLineToRelative(4.996f)
                lineToRelative(-6.524f, -6.524f)
                lineToRelative(3.243f, -0.938f)
                close()
                moveTo(2.521f, 20.973f)
                curveToRelative(-0.489f, -0.652f, -0.64f, -1.474f, -0.414f, -2.257f)
                lineToRelative(0.939f, -3.243f)
                lineToRelative(6.524f, 6.524f)
                horizontalLineToRelative(-4.996f)
                curveToRelative(-0.814f, 0.0f, -1.562f, -0.373f, -2.052f, -1.025f)
                close()
                moveTo(15.117f, 8.952f)
                lineToRelative(-6.164f, 6.165f)
                lineToRelative(-1.416f, -1.416f)
                lineToRelative(6.164f, -6.165f)
                lineToRelative(1.416f, 1.416f)
                close()
                moveTo(16.533f, 10.369f)
                lineToRelative(1.416f, 1.416f)
                lineToRelative(-6.164f, 6.164f)
                lineToRelative(-1.416f, -1.416f)
                lineToRelative(6.164f, -6.164f)
                close()
            }
        }
        .build()
        return _maskFace!!
    }

private var _maskFace: ImageVector? = null
