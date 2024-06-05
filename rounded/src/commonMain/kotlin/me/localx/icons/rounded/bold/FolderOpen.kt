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

public val Icons.Bold.FolderOpen: ImageVector
    get() {
        if (_folderOpen != null) {
            return _folderOpen!!
        }
        _folderOpen = Builder(name = "FolderOpen", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.395f, 11.231f)
                curveToRelative(-0.571f, -0.767f, -1.441f, -1.213f, -2.395f, -1.23f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -3.033f, -2.468f, -5.5f, -5.5f, -5.5f)
                horizontalLineToRelative(-4.056f)
                curveToRelative(-0.077f, 0.0f, -0.155f, -0.018f, -0.224f, -0.053f)
                lineToRelative(-3.155f, -1.578f)
                curveToRelative(-0.483f, -0.241f, -1.024f, -0.369f, -1.565f, -0.369f)
                horizontalLineToRelative(-2.0f)
                curveTo(2.019f, 1.0f, 0.0f, 3.019f, 0.0f, 5.5f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 3.033f, 2.468f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(11.558f)
                curveToRelative(2.447f, 0.0f, 4.565f, -1.575f, 5.269f, -3.919f)
                lineToRelative(1.544f, -5.147f)
                curveToRelative(0.28f, -0.935f, 0.106f, -1.919f, -0.476f, -2.702f)
                close()
                moveTo(4.867f, 13.02f)
                lineToRelative(-1.784f, 5.119f)
                curveToRelative(-0.054f, -0.204f, -0.082f, -0.418f, -0.082f, -0.638f)
                verticalLineToRelative(-9.5f)
                horizontalLineToRelative(14.95f)
                curveToRelative(0.033f, 0.162f, 0.05f, 0.329f, 0.05f, 0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-8.885f)
                curveToRelative(-1.913f, 0.0f, -3.62f, 1.213f, -4.249f, 3.02f)
                close()
                moveTo(19.454f, 18.219f)
                curveToRelative(-0.32f, 1.066f, -1.282f, 1.782f, -2.396f, 1.782f)
                lineTo(5.61f, 20.001f)
                lineToRelative(2.089f, -5.994f)
                curveToRelative(0.209f, -0.602f, 0.778f, -1.006f, 1.416f, -1.006f)
                horizontalLineToRelative(11.882f)
                lineToRelative(-1.544f, 5.218f)
                close()
            }
        }
        .build()
        return _folderOpen!!
    }

private var _folderOpen: ImageVector? = null
