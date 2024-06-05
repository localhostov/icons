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

public val Icons.Outline.BookSpells: ImageVector
    get() {
        if (_bookSpells != null) {
            return _bookSpells!!
        }
        _bookSpells = Builder(name = "BookSpells", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 12.5f)
                lineToRelative(2.333f, -1.167f)
                lineToRelative(1.167f, -2.333f)
                lineToRelative(1.167f, 2.333f)
                lineToRelative(2.333f, 1.167f)
                lineToRelative(-2.333f, 1.167f)
                lineToRelative(-1.167f, 2.333f)
                lineToRelative(-1.167f, -2.333f)
                lineToRelative(-2.333f, -1.167f)
                close()
                moveTo(8.5f, 10.5f)
                lineToRelative(1.0f, -2.0f)
                lineToRelative(2.0f, -1.0f)
                lineToRelative(-2.0f, -1.0f)
                lineToRelative(-1.0f, -2.0f)
                lineToRelative(-1.0f, 2.0f)
                lineToRelative(-2.0f, 1.0f)
                lineToRelative(2.0f, 1.0f)
                lineToRelative(1.0f, 2.0f)
                close()
                moveTo(22.0f, 2.0f)
                verticalLineToRelative(22.0f)
                lineTo(5.0f, 24.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(2.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(15.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                close()
                moveTo(4.0f, 3.0f)
                verticalLineToRelative(15.172f)
                curveToRelative(0.313f, -0.111f, 0.649f, -0.172f, 1.0f, -0.172f)
                horizontalLineToRelative(15.0f)
                lineTo(20.0f, 2.0f)
                lineTo(5.0f, 2.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                close()
                moveTo(20.0f, 22.0f)
                verticalLineToRelative(-2.0f)
                lineTo(5.0f, 20.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.449f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(15.0f)
                close()
            }
        }
        .build()
        return _bookSpells!!
    }

private var _bookSpells: ImageVector? = null
