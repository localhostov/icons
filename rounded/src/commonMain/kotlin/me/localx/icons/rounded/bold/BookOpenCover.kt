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

public val Icons.Bold.BookOpenCover: ImageVector
    get() {
        if (_bookOpenCover != null) {
            return _bookOpenCover!!
        }
        _bookOpenCover = Builder(name = "BookOpenCover", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.974f, 4.025f)
                curveToRelative(-0.335f, -0.335f, -0.727f, -0.592f, -1.153f, -0.765f)
                curveToRelative(-0.264f, -0.927f, -0.815f, -1.75f, -1.611f, -2.351f)
                curveToRelative(-1.138f, -0.859f, -2.578f, -1.127f, -3.946f, -0.735f)
                lineToRelative(-2.915f, 0.833f)
                curveToRelative(-0.5f, 0.143f, -0.956f, 0.382f, -1.349f, 0.693f)
                curveToRelative(-0.393f, -0.311f, -0.848f, -0.55f, -1.349f, -0.693f)
                lineTo(7.736f, 0.175f)
                curveToRelative(-1.372f, -0.391f, -2.809f, -0.124f, -3.946f, 0.735f)
                curveToRelative(-0.796f, 0.6f, -1.347f, 1.424f, -1.611f, 2.351f)
                curveToRelative(-0.426f, 0.173f, -0.818f, 0.43f, -1.153f, 0.765f)
                curveToRelative(-0.662f, 0.661f, -1.026f, 1.54f, -1.026f, 2.475f)
                verticalLineToRelative(10.263f)
                curveToRelative(0.0f, 2.442f, 1.64f, 4.617f, 3.989f, 5.289f)
                lineToRelative(5.676f, 1.622f)
                curveToRelative(1.528f, 0.437f, 3.143f, 0.437f, 4.67f, 0.0f)
                lineToRelative(5.676f, -1.622f)
                curveToRelative(2.349f, -0.671f, 3.989f, -2.846f, 3.989f, -5.289f)
                lineTo(24.0f, 6.5f)
                curveToRelative(0.0f, -0.935f, -0.364f, -1.814f, -1.026f, -2.475f)
                close()
                moveTo(13.5f, 4.785f)
                curveToRelative(0.0f, -0.412f, 0.277f, -0.779f, 0.673f, -0.893f)
                lineToRelative(2.915f, -0.833f)
                curveToRelative(0.451f, -0.13f, 0.936f, -0.043f, 1.315f, 0.245f)
                curveToRelative(0.379f, 0.286f, 0.597f, 0.723f, 0.597f, 1.198f)
                verticalLineToRelative(12.087f)
                curveToRelative(0.0f, 0.666f, -0.447f, 1.259f, -1.088f, 1.442f)
                lineToRelative(-4.412f, 1.261f)
                lineTo(13.5f, 4.785f)
                close()
                moveTo(5.0f, 4.502f)
                curveToRelative(0.0f, -0.475f, 0.217f, -0.912f, 0.597f, -1.198f)
                curveToRelative(0.38f, -0.287f, 0.864f, -0.374f, 1.315f, -0.245f)
                lineToRelative(2.915f, 0.833f)
                curveToRelative(0.396f, 0.113f, 0.673f, 0.48f, 0.673f, 0.893f)
                verticalLineToRelative(14.506f)
                lineToRelative(-4.413f, -1.261f)
                curveToRelative(-0.64f, -0.183f, -1.087f, -0.776f, -1.087f, -1.442f)
                lineTo(5.0f, 4.502f)
                close()
            }
        }
        .build()
        return _bookOpenCover!!
    }

private var _bookOpenCover: ImageVector? = null
