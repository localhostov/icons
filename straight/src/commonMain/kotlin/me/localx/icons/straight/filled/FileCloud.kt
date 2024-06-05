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

public val Icons.Filled.FileCloud: ImageVector
    get() {
        if (_fileCloud != null) {
            return _fileCloud!!
        }
        _fileCloud = Builder(name = "FileCloud", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.414f, 5.0f)
                horizontalLineToRelative(-4.414f)
                lineTo(17.0f, 0.586f)
                lineToRelative(4.414f, 4.414f)
                close()
                moveTo(14.789f, 15.03f)
                lineToRelative(-0.759f, -0.147f)
                lineToRelative(-0.049f, -0.771f)
                curveToRelative(-0.074f, -1.184f, -1.054f, -2.111f, -2.231f, -2.111f)
                curveToRelative(-1.241f, 0.0f, -2.25f, 1.01f, -2.25f, 2.25f)
                curveToRelative(0.0f, 0.246f, 0.048f, 0.497f, 0.146f, 0.767f)
                lineToRelative(0.458f, 1.253f)
                lineToRelative(-1.332f, 0.088f)
                curveToRelative(-0.433f, 0.028f, -0.772f, 0.387f, -0.772f, 0.816f)
                curveToRelative(0.0f, 0.455f, 0.371f, 0.826f, 0.826f, 0.826f)
                horizontalLineToRelative(5.674f)
                curveToRelative(0.827f, 0.0f, 1.5f, -0.673f, 1.5f, -1.5f)
                curveToRelative(0.0f, -0.715f, -0.51f, -1.333f, -1.211f, -1.47f)
                close()
                moveTo(15.0f, 7.0f)
                lineTo(15.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                lineTo(2.0f, 24.0f)
                lineTo(22.0f, 24.0f)
                lineTo(22.0f, 7.0f)
                horizontalLineToRelative(-7.0f)
                close()
                moveTo(14.5f, 20.0f)
                horizontalLineToRelative(-5.674f)
                curveToRelative(-1.559f, 0.0f, -2.826f, -1.268f, -2.826f, -2.826f)
                curveToRelative(0.0f, -1.078f, 0.616f, -2.026f, 1.523f, -2.5f)
                curveToRelative(-0.016f, -0.142f, -0.023f, -0.283f, -0.023f, -0.424f)
                curveToRelative(0.0f, -2.344f, 1.907f, -4.25f, 4.25f, -4.25f)
                curveToRelative(1.99f, 0.0f, 3.684f, 1.395f, 4.124f, 3.283f)
                curveToRelative(1.266f, 0.54f, 2.126f, 1.797f, 2.126f, 3.217f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                close()
            }
        }
        .build()
        return _fileCloud!!
    }

private var _fileCloud: ImageVector? = null
