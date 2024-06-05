package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.SimCards: ImageVector
    get() {
        if (_simCards != null) {
            return _simCards!!
        }
        _simCards = Builder(name = "SimCards", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 0.0f)
                horizontalLineToRelative(-4.757f)
                curveToRelative(-1.068f, 0.0f, -2.072f, 0.416f, -2.829f, 1.172f)
                lineToRelative(-2.242f, 2.242f)
                curveToRelative(-0.745f, 0.744f, -1.172f, 1.774f, -1.172f, 2.828f)
                verticalLineToRelative(8.758f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(22.0f, 5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(20.0f, 15.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(8.0f, 6.242f)
                curveToRelative(0.0f, -0.526f, 0.213f, -1.042f, 0.586f, -1.414f)
                lineToRelative(2.242f, -2.242f)
                curveToRelative(0.378f, -0.378f, 0.881f, -0.586f, 1.415f, -0.586f)
                horizontalLineToRelative(4.757f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(10.0f)
                close()
                moveTo(17.0f, 23.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-4.962f, 0.0f, -9.0f, -4.037f, -9.0f, -9.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 3.859f, 3.14f, 7.0f, 7.0f, 7.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                close()
                moveTo(14.0f, 12.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(18.0f, 10.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(10.0f, 13.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(14.0f, 13.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _simCards!!
    }

private var _simCards: ImageVector? = null
