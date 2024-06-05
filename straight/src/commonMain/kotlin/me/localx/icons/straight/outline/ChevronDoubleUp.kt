package me.localx.icons.straight.outline

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

public val Icons.Outline.ChevronDoubleUp: ImageVector
    get() {
        if (_chevronDoubleUp != null) {
            return _chevronDoubleUp!!
        }
        _chevronDoubleUp = Builder(name = "ChevronDoubleUp", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.713f, 3.119f)
                lineToRelative(9.893f, 9.892f)
                lineTo(24.019f, 11.6f)
                lineTo(14.127f, 1.705f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -4.242f, 0.0f)
                lineTo(0.0f, 11.59f)
                lineTo(1.414f, 13.0f)
                lineTo(11.3f, 3.12f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.713f, 3.119f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.589f, 23.0f)
                lineToRelative(1.417f, -1.417f)
                lineToRelative(-11.29f, -11.29f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, 0.0f)
                lineTo(0.006f, 21.582f)
                lineTo(1.422f, 23.0f)
                lineTo(12.006f, 12.412f)
                close()
            }
        }
        .build()
        return _chevronDoubleUp!!
    }

private var _chevronDoubleUp: ImageVector? = null
