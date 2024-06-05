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

public val Icons.Filled.MountainCity: ImageVector
    get() {
        if (_mountainCity != null) {
            return _mountainCity!!
        }
        _mountainCity = Builder(name = "MountainCity", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.245f, 12.615f)
                lineToRelative(3.755f, -6.906f)
                lineToRelative(3.8f, 6.989f)
                lineToRelative(-1.793f, 2.884f)
                lineToRelative(-2.014f, -3.356f)
                lineToRelative(-1.996f, 3.327f)
                lineToRelative(-1.752f, -2.937f)
                close()
                moveTo(13.9f, 14.719f)
                lineToRelative(-2.922f, 4.699f)
                lineToRelative(-1.984f, -3.306f)
                lineToRelative(-2.001f, 3.335f)
                lineToRelative(-2.858f, -4.79f)
                lineTo(0.0f, 22.261f)
                verticalLineToRelative(1.739f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-1.739f)
                lineToRelative(-4.101f, -7.541f)
                close()
                moveTo(24.0f, 3.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.248f)
                lineToRelative(-1.496f, -2.752f)
                horizontalLineToRelative(1.496f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.074f)
                lineToRelative(-2.0f, -3.678f)
                lineToRelative(-1.846f, -3.395f)
                horizontalLineToRelative(1.846f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.718f)
                lineToRelative(-4.0f, -7.357f)
                verticalLineToRelative(-0.362f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(20.0f, 13.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(20.0f, 9.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(20.0f, 5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _mountainCity!!
    }

private var _mountainCity: ImageVector? = null
