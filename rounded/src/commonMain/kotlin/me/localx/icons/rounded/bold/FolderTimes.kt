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

public val Icons.Bold.FolderTimes: ImageVector
    get() {
        if (_folderTimes != null) {
            return _folderTimes!!
        }
        _folderTimes = Builder(name = "FolderTimes", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 8.5f)
                verticalLineToRelative(9.535f)
                curveToRelative(0.0f, 1.957f, -1.054f, 3.782f, -2.749f, 4.764f)
                curveToRelative(-0.705f, 0.41f, -1.632f, 0.176f, -2.05f, -0.548f)
                curveToRelative(-0.414f, -0.717f, -0.169f, -1.635f, 0.548f, -2.05f)
                curveToRelative(0.771f, -0.446f, 1.251f, -1.276f, 1.251f, -2.166f)
                lineTo(21.0f, 8.5f)
                curveToRelative(0.0f, -0.171f, -0.017f, -0.338f, -0.05f, -0.5f)
                lineTo(3.0f, 8.0f)
                verticalLineToRelative(10.035f)
                curveToRelative(0.0f, 0.89f, 0.479f, 1.72f, 1.251f, 2.166f)
                curveToRelative(0.717f, 0.415f, 0.962f, 1.333f, 0.548f, 2.05f)
                curveToRelative(-0.416f, 0.718f, -1.333f, 0.963f, -2.05f, 0.548f)
                curveToRelative(-1.695f, -0.981f, -2.749f, -2.807f, -2.749f, -4.764f)
                lineTo(-0.0f, 6.5f)
                curveTo(0.0f, 3.468f, 2.468f, 1.0f, 5.5f, 1.0f)
                horizontalLineToRelative(2.528f)
                curveToRelative(0.54f, 0.0f, 1.081f, 0.128f, 1.564f, 0.369f)
                lineToRelative(3.156f, 1.578f)
                curveToRelative(0.068f, 0.034f, 0.146f, 0.053f, 0.223f, 0.053f)
                horizontalLineToRelative(5.528f)
                curveToRelative(3.032f, 0.0f, 5.5f, 2.468f, 5.5f, 5.5f)
                close()
                moveTo(18.0f, 17.0f)
                curveToRelative(-0.245f, 7.931f, -11.756f, 7.929f, -12.0f, 0.0f)
                curveToRelative(0.245f, -7.931f, 11.756f, -7.929f, 12.0f, 0.0f)
                close()
                moveTo(14.561f, 17.44f)
                lineToRelative(-1.061f, -1.061f)
                verticalLineToRelative(-1.879f)
                curveToRelative(-0.034f, -1.972f, -2.967f, -1.971f, -3.0f, 0.0f)
                verticalLineToRelative(2.293f)
                curveToRelative(0.0f, 0.53f, 0.211f, 1.039f, 0.586f, 1.414f)
                lineToRelative(1.354f, 1.354f)
                curveToRelative(1.393f, 1.381f, 3.502f, -0.729f, 2.121f, -2.121f)
                close()
            }
        }
        .build()
        return _folderTimes!!
    }

private var _folderTimes: ImageVector? = null
