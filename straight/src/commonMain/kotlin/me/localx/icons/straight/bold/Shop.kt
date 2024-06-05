package me.localx.icons.straight.bold

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

public val Icons.Bold.Shop: ImageVector
    get() {
        if (_shop != null) {
            return _shop!!
        }
        _shop = Builder(name = "Shop", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 10.091f)
                lineTo(21.794f, 0.0f)
                horizontalLineTo(2.206f)
                lineTo(0.036f, 9.766f)
                lineTo(0.0f, 11.046f)
                arcToRelative(4.313f, 4.313f, 0.0f, false, false, 0.955f, 2.69f)
                verticalLineTo(21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineToRelative(16.09f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                verticalLineTo(13.736f)
                arcTo(4.313f, 4.313f, 0.0f, false, false, 24.0f, 11.046f)
                close()
                moveTo(3.0f, 10.256f)
                lineTo(4.612f, 3.0f)
                horizontalLineToRelative(2.07f)
                verticalLineTo(6.272f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(4.636f)
                verticalLineTo(6.272f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(2.07f)
                lineTo(21.0f, 10.256f)
                verticalLineToRelative(0.79f)
                arcToRelative(1.365f, 1.365f, 0.0f, false, true, -1.364f, 1.363f)
                horizontalLineToRelative(-0.954f)
                arcToRelative(1.365f, 1.365f, 0.0f, false, true, -1.364f, -1.363f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(1.364f, 1.364f, 0.0f, false, true, -1.363f, 1.363f)
                horizontalLineToRelative(-1.91f)
                arcToRelative(1.364f, 1.364f, 0.0f, false, true, -1.363f, -1.363f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(1.365f, 1.365f, 0.0f, false, true, -1.364f, 1.363f)
                horizontalLineTo(4.364f)
                arcTo(1.365f, 1.365f, 0.0f, false, true, 3.0f, 11.046f)
                close()
                moveTo(3.955f, 21.0f)
                verticalLineTo(15.368f)
                curveToRelative(0.136f, 0.013f, 0.269f, 0.041f, 0.409f, 0.041f)
                horizontalLineToRelative(0.954f)
                arcToRelative(4.33f, 4.33f, 0.0f, false, false, 2.864f, -1.1f)
                arcToRelative(4.327f, 4.327f, 0.0f, false, false, 2.863f, 1.1f)
                horizontalLineToRelative(1.91f)
                arcToRelative(4.347f, 4.347f, 0.0f, false, false, 2.863f, -1.073f)
                arcToRelative(4.348f, 4.348f, 0.0f, false, false, 2.864f, 1.073f)
                horizontalLineToRelative(0.954f)
                curveToRelative(0.14f, 0.0f, 0.273f, -0.028f, 0.409f, -0.041f)
                verticalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _shop!!
    }

private var _shop: ImageVector? = null
