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

public val Icons.Bold.Baseball: ImageVector
    get() {
        if (_baseball != null) {
            return _baseball!!
        }
        _baseball = Builder(name = "Baseball", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(19.231f, 17.336f)
                arcToRelative(7.451f, 7.451f, 0.0f, false, true, -1.148f, -1.462f)
                arcToRelative(1.494f, 1.494f, 0.0f, false, false, -1.0f, -2.81f)
                arcTo(7.659f, 7.659f, 0.0f, false, true, 17.0f, 12.0f)
                arcToRelative(7.554f, 7.554f, 0.0f, false, true, 0.084f, -1.068f)
                arcTo(1.471f, 1.471f, 0.0f, false, false, 17.5f, 11.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.583f, -2.874f)
                arcToRelative(7.451f, 7.451f, 0.0f, false, true, 1.148f, -1.462f)
                arcToRelative(8.932f, 8.932f, 0.0f, false, true, 0.0f, 10.672f)
                close()
                moveTo(4.769f, 6.664f)
                arcTo(7.451f, 7.451f, 0.0f, false, true, 5.917f, 8.126f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.5f, 11.0f)
                arcToRelative(1.471f, 1.471f, 0.0f, false, false, 0.416f, -0.068f)
                arcTo(7.554f, 7.554f, 0.0f, false, true, 7.0f, 12.0f)
                arcToRelative(7.659f, 7.659f, 0.0f, false, true, -0.083f, 1.064f)
                arcToRelative(1.494f, 1.494f, 0.0f, false, false, -1.0f, 2.81f)
                arcToRelative(7.451f, 7.451f, 0.0f, false, true, -1.148f, 1.462f)
                arcToRelative(8.932f, 8.932f, 0.0f, false, true, 0.0f, -10.672f)
                close()
                moveTo(6.92f, 19.423f)
                arcTo(10.41f, 10.41f, 0.0f, false, false, 8.808f, 16.85f)
                lineToRelative(0.217f, 0.073f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.95f, -2.846f)
                lineToRelative(-0.182f, -0.06f)
                arcTo(10.623f, 10.623f, 0.0f, false, false, 10.0f, 12.0f)
                arcToRelative(10.623f, 10.623f, 0.0f, false, false, -0.207f, -2.017f)
                lineToRelative(0.182f, -0.06f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.95f, -2.846f)
                lineToRelative(-0.217f, 0.073f)
                arcTo(10.41f, 10.41f, 0.0f, false, false, 6.92f, 4.577f)
                arcToRelative(8.971f, 8.971f, 0.0f, false, true, 10.16f, 0.0f)
                arcTo(10.41f, 10.41f, 0.0f, false, false, 15.192f, 7.15f)
                lineToRelative(-0.217f, -0.073f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.95f, 2.846f)
                lineToRelative(0.182f, 0.06f)
                arcTo(10.623f, 10.623f, 0.0f, false, false, 14.0f, 12.0f)
                arcToRelative(10.623f, 10.623f, 0.0f, false, false, 0.207f, 2.017f)
                lineToRelative(-0.182f, 0.06f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.95f, 2.846f)
                lineToRelative(0.217f, -0.073f)
                arcToRelative(10.41f, 10.41f, 0.0f, false, false, 1.888f, 2.573f)
                arcToRelative(8.971f, 8.971f, 0.0f, false, true, -10.16f, 0.0f)
                close()
            }
        }
        .build()
        return _baseball!!
    }

private var _baseball: ImageVector? = null
