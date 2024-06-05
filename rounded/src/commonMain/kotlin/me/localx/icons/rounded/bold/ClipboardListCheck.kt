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

public val Icons.Bold.ClipboardListCheck: ImageVector
    get() {
        if (_clipboardListCheck != null) {
            return _clipboardListCheck!!
        }
        _clipboardListCheck = Builder(name = "ClipboardListCheck", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 18.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.972f, -0.033f, -1.971f, -2.967f, 0.0f, -3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.972f, 0.033f, 1.971f, 2.967f, 0.0f, 3.0f)
                close()
                moveTo(8.5f, 15.0f)
                curveToRelative(-1.972f, 0.034f, -1.971f, 2.967f, 0.0f, 3.0f)
                curveToRelative(1.972f, -0.034f, 1.971f, -2.967f, 0.0f, -3.0f)
                close()
                moveTo(15.5f, 10.0f)
                curveToRelative(-1.972f, 0.034f, -1.971f, 2.967f, 0.0f, 3.0f)
                curveToRelative(1.972f, -0.034f, 1.971f, -2.967f, 0.0f, -3.0f)
                close()
                moveTo(10.682f, 12.382f)
                lineToRelative(1.862f, -1.805f)
                curveToRelative(0.595f, -0.577f, 0.61f, -1.526f, 0.033f, -2.121f)
                curveToRelative(-0.578f, -0.596f, -1.526f, -0.61f, -2.121f, -0.033f)
                lineToRelative(-1.297f, 1.257f)
                lineToRelative(-0.463f, -0.438f)
                curveToRelative(-0.603f, -0.568f, -1.552f, -0.541f, -2.121f, 0.061f)
                curveToRelative(-0.569f, 0.603f, -0.542f, 1.552f, 0.061f, 2.121f)
                lineToRelative(0.998f, 0.941f)
                curveToRelative(0.424f, 0.425f, 0.982f, 0.636f, 1.538f, 0.636f)
                curveToRelative(0.55f, 0.0f, 1.097f, -0.207f, 1.509f, -0.619f)
                close()
                moveTo(22.0f, 18.5f)
                lineTo(22.0f, 7.5f)
                curveToRelative(0.0f, -2.978f, -2.379f, -5.411f, -5.337f, -5.498f)
                curveToRelative(-0.562f, -1.183f, -1.769f, -2.002f, -3.163f, -2.002f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.395f, 0.0f, -2.601f, 0.819f, -3.163f, 2.002f)
                curveToRelative(-2.958f, 0.086f, -5.337f, 2.52f, -5.337f, 5.498f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 3.033f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                close()
                moveTo(8.5f, 5.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                curveToRelative(0.0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 1.378f, -1.122f, 2.5f, -2.5f, 2.5f)
                lineTo(7.5f, 21.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                lineTo(5.0f, 7.5f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _clipboardListCheck!!
    }

private var _clipboardListCheck: ImageVector? = null
