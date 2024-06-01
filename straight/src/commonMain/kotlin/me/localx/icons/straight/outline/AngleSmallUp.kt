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

public val Icons.Outline.AngleSmallUp: ImageVector
    get() {
        if (_angleSmallUp != null) {
            return _angleSmallUp!!
        }
        _angleSmallUp = Builder(name = "AngleSmallUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.2933f, 15.207f)
                lineTo(12.0003f, 9.914f)
                lineTo(6.7073f, 15.207f)
                lineTo(5.2933f, 13.793f)
                lineTo(10.5863f, 8.5f)
                curveTo(10.9614f, 8.1251f, 11.47f, 7.9144f, 12.0003f, 7.9144f)
                curveTo(12.5307f, 7.9144f, 13.0393f, 8.1251f, 13.4143f, 8.5f)
                lineTo(18.7073f, 13.793f)
                lineTo(17.2933f, 15.207f)
                close()
            }
        }
        .build()
        return _angleSmallUp!!
    }

private var _angleSmallUp: ImageVector? = null
