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

public val Icons.Outline.P: ImageVector
    get() {
        if (_p != null) {
            return _p!!
        }
        _p = Builder(name = "P", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 24.0f)
                lineTo(2.0f, 24.0f)
                lineTo(2.0f, 3.0f)
                curveTo(2.0f, 1.346f, 3.346f, 0.0f, 5.0f, 0.0f)
                lineTo(14.5f, 0.0f)
                curveToRelative(4.136f, 0.0f, 7.5f, 3.364f, 7.5f, 7.5f)
                reflectiveCurveToRelative(-3.364f, 7.5f, -7.5f, 7.5f)
                lineTo(4.0f, 15.0f)
                verticalLineToRelative(9.0f)
                close()
                moveTo(4.0f, 13.0f)
                lineTo(14.5f, 13.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                reflectiveCurveToRelative(-2.467f, -5.5f, -5.5f, -5.5f)
                lineTo(5.0f, 2.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                lineTo(4.0f, 13.0f)
                close()
            }
        }
        .build()
        return _p!!
    }

private var _p: ImageVector? = null
