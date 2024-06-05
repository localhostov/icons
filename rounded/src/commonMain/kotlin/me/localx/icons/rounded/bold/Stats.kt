package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.Stats: ImageVector
    get() {
        if (_stats != null) {
            return _stats!!
        }
        _stats = Builder(name = "Stats", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 21.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 3.0f, 18.5f)
                verticalLineTo(1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 1.5f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 0.0f, 1.5f)
                verticalLineToRelative(17.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 5.5f, 24.0f)
                horizontalLineToRelative(17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 24.0f, 22.5f)
                horizontalLineToRelative(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 22.5f, 21.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 18.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 21.0f, 16.5f)
                verticalLineToRelative(-6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineToRelative(6.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 19.5f, 18.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 18.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.0f, 16.5f)
                verticalLineToRelative(-6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineToRelative(6.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.5f, 18.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 18.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.0f, 16.5f)
                verticalLineTo(5.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineToRelative(11.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.5f, 18.0f)
                close()
            }
        }
        .build()
        return _stats!!
    }

private var _stats: ImageVector? = null
