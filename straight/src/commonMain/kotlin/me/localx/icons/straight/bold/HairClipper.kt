package me.localx.icons.straight.bold

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

public val Icons.Bold.HairClipper: ImageVector
    get() {
        if (_hairClipper != null) {
            return _hairClipper!!
        }
        _hairClipper = Builder(name = "HairClipper", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.561f, 12.439f)
                lineToRelative(2.353f, 2.353f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(-2.353f, -2.353f)
                lineToRelative(2.121f, -2.121f)
                close()
                moveTo(21.809f, 23.929f)
                lineToRelative(-2.828f, -2.827f)
                curveToRelative(-0.902f, 0.519f, -1.911f, 0.803f, -2.93f, 0.803f)
                curveToRelative(-1.351f, 0.0f, -2.703f, -0.459f, -3.792f, -1.389f)
                curveToRelative(-2.867f, -2.445f, -6.848f, -5.925f, -9.641f, -8.708f)
                curveToRelative(-0.008f, -0.008f, -2.571f, -2.57f, -2.571f, -2.57f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-1.414f, -1.415f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(1.414f, 1.415f)
                lineToRelative(1.415f, -1.415f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(9.238f, 0.046f)
                reflectiveCurveToRelative(2.557f, 2.559f, 2.563f, 2.565f)
                curveToRelative(2.778f, 2.789f, 6.265f, 6.776f, 8.715f, 9.648f)
                curveToRelative(1.63f, 1.911f, 1.791f, 4.624f, 0.585f, 6.722f)
                lineToRelative(2.828f, 2.828f)
                lineToRelative(-2.121f, 2.121f)
                close()
                moveTo(9.663f, 9.663f)
                curveToRelative(1.013f, -1.013f, 1.273f, -2.498f, 0.782f, -3.754f)
                lineToRelative(-4.536f, 4.537f)
                curveToRelative(1.26f, 0.493f, 2.742f, 0.23f, 3.754f, -0.783f)
                close()
                moveTo(18.077f, 18.077f)
                curveToRelative(1.047f, -1.047f, 1.115f, -2.747f, 0.156f, -3.871f)
                curveToRelative(-1.364f, -1.599f, -3.052f, -3.545f, -4.752f, -5.429f)
                curveToRelative(-0.276f, 1.102f, -0.837f, 2.147f, -1.697f, 3.007f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.861f, 0.86f, -1.905f, 1.421f, -3.007f, 1.697f)
                curveToRelative(1.885f, 1.701f, 3.831f, 3.389f, 5.429f, 4.752f)
                curveToRelative(1.125f, 0.959f, 2.825f, 0.89f, 3.871f, -0.157f)
                close()
            }
        }
        .build()
        return _hairClipper!!
    }

private var _hairClipper: ImageVector? = null
