package me.localx.icons.straight.bold

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

public val Icons.Bold.UtilityPole: ImageVector
    get() {
        if (_utilityPole != null) {
            return _utilityPole!!
        }
        _utilityPole = Builder(name = "UtilityPole", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 5.0f)
                lineTo(24.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(20.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.5f)
                lineTo(13.5f, 0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.5f)
                lineTo(7.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(3.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.879f)
                lineToRelative(6.621f, 6.621f)
                verticalLineToRelative(12.379f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-12.379f)
                lineToRelative(6.621f, -6.621f)
                horizontalLineToRelative(3.879f)
                close()
                moveTo(8.121f, 5.0f)
                horizontalLineToRelative(2.379f)
                verticalLineToRelative(2.379f)
                lineToRelative(-2.379f, -2.379f)
                close()
                moveTo(13.5f, 7.379f)
                verticalLineToRelative(-2.379f)
                horizontalLineToRelative(2.379f)
                lineToRelative(-2.379f, 2.379f)
                close()
            }
        }
        .build()
        return _utilityPole!!
    }

private var _utilityPole: ImageVector? = null
