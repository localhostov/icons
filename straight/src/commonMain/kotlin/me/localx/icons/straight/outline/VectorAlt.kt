package me.localx.icons.straight.outline

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

public val Icons.Outline.VectorAlt: ImageVector
    get() {
        if (_vectorAlt != null) {
            return _vectorAlt!!
        }
        _vectorAlt = Builder(name = "VectorAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 16.0f)
                verticalLineTo(12.0f)
                arcToRelative(8.962f, 8.962f, 0.0f, false, false, -3.371f, -7.0f)
                horizontalLineToRelative(2.648f)
                arcToRelative(1.991f, 1.991f, 0.0f, true, false, -0.009f, -2.0f)
                horizontalLineToRelative(-4.41f)
                arcTo(3.981f, 3.981f, 0.0f, false, false, 8.142f, 3.0f)
                horizontalLineTo(3.723f)
                arcToRelative(1.991f, 1.991f, 0.0f, true, false, 0.009f, 2.0f)
                horizontalLineTo(6.371f)
                arcTo(8.962f, 8.962f, 0.0f, false, false, 3.0f, 12.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(12.0f)
                arcTo(6.993f, 6.993f, 0.0f, false, true, 8.522f, 5.937f)
                arcToRelative(3.963f, 3.963f, 0.0f, false, false, 6.956f, 0.0f)
                arcTo(6.993f, 6.993f, 0.0f, false, true, 19.0f, 12.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                verticalLineTo(16.0f)
                close()
                moveTo(6.0f, 22.0f)
                horizontalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(12.0f, 6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, -2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 6.0f)
                close()
                moveTo(22.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _vectorAlt!!
    }

private var _vectorAlt: ImageVector? = null
