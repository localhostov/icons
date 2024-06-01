package me.localx.icons.rounded.filled

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

public val Icons.Filled.MenuDotsVertical: ImageVector
    get() {
        if (_menuDotsVertical != null) {
            return _menuDotsVertical!!
        }
        _menuDotsVertical = Builder(name = "MenuDotsVertical", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveTo(13.1046f, 4.0f, 14.0f, 3.1046f, 14.0f, 2.0f)
                curveTo(14.0f, 0.8954f, 13.1046f, 0.0f, 12.0f, 0.0f)
                curveTo(10.8954f, 0.0f, 10.0f, 0.8954f, 10.0f, 2.0f)
                curveTo(10.0f, 3.1046f, 10.8954f, 4.0f, 12.0f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 14.0f)
                curveTo(13.1046f, 14.0f, 14.0f, 13.1046f, 14.0f, 12.0f)
                curveTo(14.0f, 10.8954f, 13.1046f, 10.0f, 12.0f, 10.0f)
                curveTo(10.8954f, 10.0f, 10.0f, 10.8954f, 10.0f, 12.0f)
                curveTo(10.0f, 13.1046f, 10.8954f, 14.0f, 12.0f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveTo(13.1046f, 24.0f, 14.0f, 23.1046f, 14.0f, 22.0f)
                curveTo(14.0f, 20.8954f, 13.1046f, 19.9999f, 12.0f, 19.9999f)
                curveTo(10.8954f, 19.9999f, 10.0f, 20.8954f, 10.0f, 22.0f)
                curveTo(10.0f, 23.1046f, 10.8954f, 24.0f, 12.0f, 24.0f)
                close()
            }
        }
        .build()
        return _menuDotsVertical!!
    }

private var _menuDotsVertical: ImageVector? = null
