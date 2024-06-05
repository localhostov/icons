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

public val Icons.Outline.LockOpenAlt: ImageVector
    get() {
        if (_lockOpenAlt != null) {
            return _lockOpenAlt!!
        }
        _lockOpenAlt = Builder(name = "LockOpenAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 18.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(24.0f, 5.5f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(3.0f, 24.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-13.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -3.032f, 2.467f, -5.5f, 5.5f, -5.5f)
                reflectiveCurveToRelative(5.5f, 2.468f, 5.5f, 5.5f)
                close()
                moveTo(2.0f, 10.0f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 0.552f, 0.449f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-11.0f)
                lineTo(2.0f, 10.0f)
                close()
            }
        }
        .build()
        return _lockOpenAlt!!
    }

private var _lockOpenAlt: ImageVector? = null
