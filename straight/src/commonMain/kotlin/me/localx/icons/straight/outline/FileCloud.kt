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

public val Icons.Outline.FileCloud: ImageVector
    get() {
        if (_fileCloud != null) {
            return _fileCloud!!
        }
        _fileCloud = Builder(name = "FileCloud", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.414f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                lineTo(2.0f, 24.0f)
                lineTo(22.0f, 24.0f)
                lineTo(22.0f, 7.586f)
                lineTo(14.414f, 0.0f)
                close()
                moveTo(15.0f, 3.414f)
                lineToRelative(3.586f, 3.586f)
                horizontalLineToRelative(-3.586f)
                lineTo(15.0f, 3.414f)
                close()
                moveTo(20.0f, 22.0f)
                lineTo(4.0f, 22.0f)
                lineTo(4.0f, 3.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                lineTo(13.0f, 2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(13.0f)
                close()
                moveTo(7.5f, 14.25f)
                curveToRelative(0.0f, 0.141f, 0.008f, 0.282f, 0.023f, 0.424f)
                curveToRelative(-0.907f, 0.474f, -1.523f, 1.422f, -1.523f, 2.5f)
                curveToRelative(0.0f, 1.559f, 1.268f, 2.826f, 2.826f, 2.826f)
                horizontalLineToRelative(5.674f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0.0f, -1.42f, -0.86f, -2.677f, -2.126f, -3.217f)
                curveToRelative(-0.44f, -1.889f, -2.134f, -3.283f, -4.124f, -3.283f)
                curveToRelative(-2.343f, 0.0f, -4.25f, 1.906f, -4.25f, 4.25f)
                close()
                moveTo(13.981f, 14.111f)
                lineToRelative(0.049f, 0.771f)
                lineToRelative(0.759f, 0.147f)
                curveToRelative(0.701f, 0.137f, 1.211f, 0.755f, 1.211f, 1.47f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-5.674f)
                curveToRelative(-0.456f, 0.0f, -0.826f, -0.371f, -0.826f, -0.826f)
                curveToRelative(0.0f, -0.43f, 0.339f, -0.788f, 0.772f, -0.816f)
                lineToRelative(1.332f, -0.088f)
                lineToRelative(-0.458f, -1.253f)
                curveToRelative(-0.099f, -0.27f, -0.146f, -0.521f, -0.146f, -0.767f)
                curveToRelative(0.0f, -1.24f, 1.009f, -2.25f, 2.25f, -2.25f)
                curveToRelative(1.177f, 0.0f, 2.157f, 0.928f, 2.231f, 2.111f)
                close()
            }
        }
        .build()
        return _fileCloud!!
    }

private var _fileCloud: ImageVector? = null
