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

public val Icons.Outline.UtilityPoleDouble: ImageVector
    get() {
        if (_utilityPoleDouble != null) {
            return _utilityPoleDouble!!
        }
        _utilityPoleDouble = Builder(name = "UtilityPoleDouble", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 4.0f)
                horizontalLineToRelative(11.0f)
                lineTo(24.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(20.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(13.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(6.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(2.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                lineTo(0.0f, 6.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.586f)
                lineToRelative(6.414f, 6.414f)
                verticalLineToRelative(7.586f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.586f)
                lineToRelative(6.414f, -6.414f)
                horizontalLineToRelative(4.586f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(7.414f, 10.0f)
                horizontalLineToRelative(3.586f)
                verticalLineToRelative(3.586f)
                lineToRelative(-3.586f, -3.586f)
                close()
                moveTo(16.586f, 10.0f)
                lineToRelative(-3.586f, 3.586f)
                verticalLineToRelative(-3.586f)
                horizontalLineToRelative(3.586f)
                close()
            }
        }
        .build()
        return _utilityPoleDouble!!
    }

private var _utilityPoleDouble: ImageVector? = null
