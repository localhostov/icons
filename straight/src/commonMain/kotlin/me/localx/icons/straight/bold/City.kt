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

public val Icons.Bold.City: ImageVector
    get() {
        if (_city != null) {
            return _city!!
        }
        _city = Builder(name = "City", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 15.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(15.5f, 8.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(15.5f, 13.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(24.0f, 3.5f)
                lineTo(24.0f, 24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 9.329f)
                curveToRelative(0.0f, -0.935f, 0.364f, -1.814f, 1.025f, -2.475f)
                lineToRelative(2.707f, -2.707f)
                curveToRelative(1.479f, -1.479f, 4.057f, -1.479f, 5.535f, 0.0f)
                lineToRelative(0.732f, 0.732f)
                verticalLineToRelative(-1.379f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(10.0f, 9.329f)
                curveToRelative(0.0f, -0.134f, -0.052f, -0.259f, -0.146f, -0.354f)
                lineToRelative(-2.707f, -2.707f)
                curveToRelative(-0.341f, -0.34f, -0.952f, -0.34f, -1.293f, 0.0f)
                lineToRelative(-2.707f, 2.707f)
                curveToRelative(-0.094f, 0.095f, -0.146f, 0.22f, -0.146f, 0.354f)
                verticalLineToRelative(11.671f)
                horizontalLineToRelative(7.0f)
                lineTo(10.001f, 9.329f)
                close()
                moveTo(21.0f, 3.5f)
                curveToRelative(0.0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                lineTo(13.0f, 21.0f)
                horizontalLineToRelative(8.0f)
                lineTo(21.0f, 3.5f)
                close()
                moveTo(5.0f, 13.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(5.0f, 18.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _city!!
    }

private var _city: ImageVector? = null
