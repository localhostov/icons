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

public val Icons.Bold.FonduePot: ImageVector
    get() {
        if (_fonduePot != null) {
            return _fonduePot!!
        }
        _fonduePot = Builder(name = "FonduePot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 7.0f)
                horizontalLineToRelative(-3.678f)
                lineToRelative(2.659f, -4.463f)
                lineToRelative(-2.578f, -1.535f)
                lineToRelative(-3.574f, 5.999f)
                horizontalLineToRelative(-1.957f)
                lineToRelative(1.435f, -6.281f)
                lineTo(13.384f, 0.051f)
                lineToRelative(-1.588f, 6.949f)
                horizontalLineToRelative(-4.626f)
                lineTo(3.596f, 1.001f)
                lineToRelative(-2.577f, 1.535f)
                lineToRelative(2.659f, 4.463f)
                lineTo(0.0f, 6.999f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 2.622f, 1.194f, 4.97f, 3.066f, 6.531f)
                lineToRelative(-2.259f, 4.969f)
                horizontalLineToRelative(3.296f)
                lineToRelative(1.363f, -3.0f)
                horizontalLineToRelative(9.068f)
                lineToRelative(1.364f, 3.0f)
                horizontalLineToRelative(3.295f)
                lineToRelative(-2.259f, -4.969f)
                curveToRelative(1.872f, -1.56f, 3.066f, -3.909f, 3.066f, -6.531f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(19.0f, 12.5f)
                curveToRelative(0.0f, 3.032f, -2.468f, 5.5f, -5.5f, 5.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-3.033f, 0.0f, -5.5f, -2.468f, -5.5f, -5.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(2.5f)
                close()
            }
        }
        .build()
        return _fonduePot!!
    }

private var _fonduePot: ImageVector? = null
