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

public val Icons.Outline.ChevronDoubleDown: ImageVector
    get() {
        if (_chevronDoubleDown != null) {
            return _chevronDoubleDown!!
        }
        _chevronDoubleDown = Builder(name = "ChevronDoubleDown", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.3f, 20.878f)
                lineTo(1.414f, 10.994f)
                lineTo(0.0f, 12.408f)
                lineToRelative(9.885f, 9.885f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 4.242f, 0.0f)
                lineTo(24.019f, 12.4f)
                lineToRelative(-1.413f, -1.413f)
                lineToRelative(-9.893f, 9.892f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.3f, 20.878f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.006f, 11.586f)
                lineTo(1.422f, 1.0f)
                lineTo(0.006f, 2.416f)
                lineTo(11.3f, 13.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, 0.0f)
                lineToRelative(11.29f, -11.29f)
                lineTo(22.589f, 1.0f)
                close()
            }
        }
        .build()
        return _chevronDoubleDown!!
    }

private var _chevronDoubleDown: ImageVector? = null
