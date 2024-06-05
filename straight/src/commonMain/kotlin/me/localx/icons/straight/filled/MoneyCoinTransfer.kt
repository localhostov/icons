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

public val Icons.Filled.MoneyCoinTransfer: ImageVector
    get() {
        if (_moneyCoinTransfer != null) {
            return _moneyCoinTransfer!!
        }
        _moneyCoinTransfer = Builder(name = "MoneyCoinTransfer", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.792f, 7.985f)
                lineToRelative(2.66f, -2.66f)
                curveToRelative(0.729f, -0.73f, 0.729f, -1.919f, 0.0f, -2.65f)
                lineTo(20.792f, 0.015f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(1.57f, 1.571f)
                horizontalLineToRelative(-8.948f)
                curveTo(7.029f, 3.0f, 3.0f, 7.029f, 3.0f, 12.0f)
                curveToRelative(0.0f, 0.353f, 0.026f, 0.7f, 0.065f, 1.043f)
                lineToRelative(4.386f, 4.386f)
                lineToRelative(-1.571f, 1.571f)
                horizontalLineToRelative(-2.829f)
                lineToRelative(1.571f, -1.571f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-2.659f, 2.659f)
                curveToRelative(-0.731f, 0.731f, -0.731f, 1.92f, 0.0f, 2.651f)
                lineToRelative(2.659f, 2.659f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-1.571f, -1.571f)
                horizontalLineToRelative(8.948f)
                curveToRelative(4.971f, 0.0f, 9.0f, -4.029f, 9.0f, -9.0f)
                curveToRelative(0.0f, -0.354f, -0.026f, -0.701f, -0.065f, -1.044f)
                lineToRelative(-4.385f, -4.385f)
                lineToRelative(1.571f, -1.571f)
                horizontalLineToRelative(2.828f)
                lineToRelative(-1.57f, 1.571f)
                lineToRelative(1.414f, 1.414f)
                close()
                moveTo(13.126f, 15.8f)
                horizontalLineToRelative(-0.326f)
                verticalLineToRelative(1.2f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-1.2f)
                horizontalLineToRelative(-0.2f)
                curveToRelative(-1.201f, 0.0f, -2.189f, -0.925f, -2.291f, -2.1f)
                horizontalLineToRelative(1.62f)
                curveToRelative(0.086f, 0.289f, 0.354f, 0.5f, 0.671f, 0.5f)
                horizontalLineToRelative(2.126f)
                curveToRelative(0.316f, 0.0f, 0.574f, -0.257f, 0.574f, -0.574f)
                curveToRelative(0.0f, -0.272f, -0.194f, -0.509f, -0.462f, -0.563f)
                lineToRelative(-2.791f, -0.559f)
                curveToRelative(-1.013f, -0.203f, -1.747f, -1.099f, -1.747f, -2.131f)
                curveToRelative(0.0f, -1.199f, 0.975f, -2.173f, 2.173f, -2.173f)
                horizontalLineToRelative(0.327f)
                verticalLineToRelative(-1.2f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(1.2f)
                horizontalLineToRelative(0.2f)
                curveToRelative(1.201f, 0.0f, 2.189f, 0.925f, 2.291f, 2.1f)
                horizontalLineToRelative(-1.62f)
                curveToRelative(-0.086f, -0.289f, -0.354f, -0.5f, -0.671f, -0.5f)
                horizontalLineToRelative(-2.127f)
                curveToRelative(-0.316f, 0.0f, -0.573f, 0.257f, -0.573f, 0.574f)
                curveToRelative(0.0f, 0.272f, 0.194f, 0.509f, 0.461f, 0.562f)
                lineToRelative(2.792f, 0.559f)
                curveToRelative(1.013f, 0.202f, 1.747f, 1.099f, 1.747f, 2.131f)
                curveToRelative(0.0f, 1.199f, -0.975f, 2.173f, -2.174f, 2.173f)
                close()
            }
        }
        .build()
        return _moneyCoinTransfer!!
    }

private var _moneyCoinTransfer: ImageVector? = null
