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

public val Icons.Bold.Pepper: ImageVector
    get() {
        if (_pepper != null) {
            return _pepper!!
        }
        _pepper = Builder(name = "Pepper", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.17f, 5.116f)
                curveTo(18.721f, 0.4f, 15.53f, 0.0f, 14.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                curveToRelative(1.12f, 0.0f, 1.542f, 1.1f, 1.673f, 2.29f)
                arcTo(6.054f, 6.054f, 0.0f, false, false, 12.0f, 10.987f)
                arcTo(2.866f, 2.866f, 0.0f, false, true, 9.0f, 14.0f)
                curveToRelative(-1.158f, 0.0f, -2.414f, -0.31f, -2.942f, -2.606f)
                arcToRelative(3.062f, 3.062f, 0.0f, false, false, -6.048f, 0.547f)
                curveTo(0.0f, 12.1f, 0.0f, 12.252f, 0.0f, 12.409f)
                arcTo(11.778f, 11.778f, 0.0f, false, false, 11.967f, 24.0f)
                arcToRelative(11.759f, 11.759f, 0.0f, false, false, 8.306f, -3.482f)
                arcTo(12.574f, 12.574f, 0.0f, false, false, 24.0f, 11.651f)
                verticalLineTo(11.0f)
                arcTo(6.009f, 6.009f, 0.0f, false, false, 19.17f, 5.116f)
                close()
                moveTo(21.0f, 11.651f)
                arcToRelative(9.552f, 9.552f, 0.0f, false, true, -2.838f, 6.735f)
                arcTo(8.787f, 8.787f, 0.0f, false, true, 11.884f, 21.0f)
                arcTo(8.608f, 8.608f, 0.0f, false, true, 3.0f, 12.409f)
                curveToRelative(0.0f, -0.112f, 0.0f, -0.224f, 0.008f, -0.335f)
                lineToRelative(0.126f, -0.009f)
                curveTo(3.866f, 15.248f, 5.949f, 17.0f, 9.0f, 17.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 6.0f, -5.988f)
                arcToRelative(2.941f, 2.941f, 0.0f, false, true, 0.168f, -0.914f)
                arcToRelative(4.9f, 4.9f, 0.0f, false, false, 5.676f, -0.009f)
                arcTo(2.986f, 2.986f, 0.0f, false, true, 21.0f, 11.0f)
                close()
            }
        }
        .build()
        return _pepper!!
    }

private var _pepper: ImageVector? = null
