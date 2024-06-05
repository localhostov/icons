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

public val Icons.Outline.Crown: ImageVector
    get() {
        if (_crown != null) {
            return _crown!!
        }
        _crown = Builder(name = "Crown", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.766f, 4.566f)
                arcTo(1.994f, 1.994f, 0.0f, false, false, 20.586f, 5.0f)
                lineTo(18.0f, 7.586f)
                lineTo(13.414f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.828f, 0.0f)
                lineTo(6.0f, 7.586f)
                lineTo(3.414f, 5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 0.0f, 6.414f)
                verticalLineTo(17.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                horizontalLineTo(19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                verticalLineTo(6.414f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.766f, 4.566f)
                close()
                moveTo(22.0f, 17.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                horizontalLineTo(5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineTo(6.414f)
                lineTo(5.293f, 9.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, 0.0f)
                lineTo(12.0f, 4.414f)
                lineToRelative(5.293f, 5.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, 0.0f)
                lineTo(22.0f, 6.414f)
                close()
            }
        }
        .build()
        return _crown!!
    }

private var _crown: ImageVector? = null
