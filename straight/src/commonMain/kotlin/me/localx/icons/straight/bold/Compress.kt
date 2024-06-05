package me.localx.icons.straight.bold

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
import me.localx.icons.straight.Icons

public val Icons.Bold.Compress: ImageVector
    get() {
        if (_compress != null) {
            return _compress!!
        }
        _compress = Builder(name = "Compress", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 5.5f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(6.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 8.5f, 6.0f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 18.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(18.5f)
                horizontalLineTo(24.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineTo(18.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 15.5f, 18.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 5.5f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(6.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.0f, 8.5f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 15.5f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(5.5f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(18.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 6.0f, 15.5f)
                close()
            }
        }
        .build()
        return _compress!!
    }

private var _compress: ImageVector? = null
