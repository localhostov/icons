package me.localx.icons.straight.filled

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

public val Icons.Filled.Flatbread: ImageVector
    get() {
        if (_flatbread != null) {
            return _flatbread!!
        }
        _flatbread = Builder(name = "Flatbread", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(10.793f, 4.793f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-6.0f, 6.0f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(6.0f, -6.0f)
                close()
                moveTo(5.793f, 16.793f)
                lineToRelative(11.0f, -11.0f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-11.0f, 11.0f)
                lineToRelative(-1.414f, -1.414f)
                close()
                moveTo(13.207f, 19.207f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(6.0f, -6.0f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-6.0f, 6.0f)
                close()
            }
        }
        .build()
        return _flatbread!!
    }

private var _flatbread: ImageVector? = null
