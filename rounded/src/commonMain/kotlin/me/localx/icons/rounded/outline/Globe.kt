package me.localx.icons.rounded.outline

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

public val Icons.Outline.Globe: ImageVector
    get() {
        if (_globe != null) {
            return _globe!!
        }
        _globe = Builder(name = "Globe", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(20.647f, 7.0f)
                lineTo(17.426f, 7.0f)
                arcToRelative(19.676f, 19.676f, 0.0f, false, false, -2.821f, -4.644f)
                arcTo(10.031f, 10.031f, 0.0f, false, true, 20.647f, 7.0f)
                close()
                moveTo(16.5f, 12.0f)
                arcToRelative(10.211f, 10.211f, 0.0f, false, true, -0.476f, 3.0f)
                lineTo(7.976f, 15.0f)
                arcTo(10.211f, 10.211f, 0.0f, false, true, 7.5f, 12.0f)
                arcToRelative(10.211f, 10.211f, 0.0f, false, true, 0.476f, -3.0f)
                horizontalLineToRelative(8.048f)
                arcTo(10.211f, 10.211f, 0.0f, false, true, 16.5f, 12.0f)
                close()
                moveTo(8.778f, 17.0f)
                horizontalLineToRelative(6.444f)
                arcTo(19.614f, 19.614f, 0.0f, false, true, 12.0f, 21.588f)
                arcTo(19.57f, 19.57f, 0.0f, false, true, 8.778f, 17.0f)
                close()
                moveTo(8.778f, 7.0f)
                arcTo(19.614f, 19.614f, 0.0f, false, true, 12.0f, 2.412f)
                arcTo(19.57f, 19.57f, 0.0f, false, true, 15.222f, 7.0f)
                close()
                moveTo(9.4f, 2.356f)
                arcTo(19.676f, 19.676f, 0.0f, false, false, 6.574f, 7.0f)
                lineTo(3.353f, 7.0f)
                arcTo(10.031f, 10.031f, 0.0f, false, true, 9.4f, 2.356f)
                close()
                moveTo(2.461f, 9.0f)
                lineTo(5.9f, 9.0f)
                arcToRelative(12.016f, 12.016f, 0.0f, false, false, -0.4f, 3.0f)
                arcToRelative(12.016f, 12.016f, 0.0f, false, false, 0.4f, 3.0f)
                lineTo(2.461f, 15.0f)
                arcToRelative(9.992f, 9.992f, 0.0f, false, true, 0.0f, -6.0f)
                close()
                moveTo(3.353f, 17.0f)
                lineTo(6.574f, 17.0f)
                arcTo(19.676f, 19.676f, 0.0f, false, false, 9.4f, 21.644f)
                arcTo(10.031f, 10.031f, 0.0f, false, true, 3.353f, 17.0f)
                close()
                moveTo(14.605f, 21.644f)
                arcTo(19.676f, 19.676f, 0.0f, false, false, 17.426f, 17.0f)
                horizontalLineToRelative(3.221f)
                arcTo(10.031f, 10.031f, 0.0f, false, true, 14.605f, 21.644f)
                close()
                moveTo(21.539f, 15.0f)
                lineTo(18.1f, 15.0f)
                arcToRelative(12.016f, 12.016f, 0.0f, false, false, 0.4f, -3.0f)
                arcToRelative(12.016f, 12.016f, 0.0f, false, false, -0.4f, -3.0f)
                horizontalLineToRelative(3.437f)
                arcToRelative(9.992f, 9.992f, 0.0f, false, true, 0.0f, 6.0f)
                close()
            }
        }
        .build()
        return _globe!!
    }

private var _globe: ImageVector? = null
