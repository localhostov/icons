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

public val Icons.Filled.UiUx: ImageVector
    get() {
        if (_uiUx != null) {
            return _uiUx!!
        }
        _uiUx = Builder(name = "UiUx", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 11.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(24.0f)
                close()
                moveTo(16.0f, 24.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(9.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(8.0f, 9.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                lineTo(12.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                lineTo(6.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                close()
                moveTo(15.547f, 9.0f)
                lineToRelative(1.203f, -2.308f)
                lineToRelative(1.203f, 2.308f)
                horizontalLineToRelative(2.286f)
                lineToRelative(-2.346f, -4.5f)
                lineToRelative(2.346f, -4.5f)
                horizontalLineToRelative(-2.286f)
                lineToRelative(-1.203f, 2.308f)
                lineToRelative(-1.203f, -2.308f)
                horizontalLineToRelative(-2.286f)
                lineToRelative(2.346f, 4.5f)
                lineToRelative(-2.346f, 4.5f)
                horizontalLineToRelative(2.286f)
                close()
            }
        }
        .build()
        return _uiUx!!
    }

private var _uiUx: ImageVector? = null
