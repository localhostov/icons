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
                moveToRelative(21.07f, 3.707f)
                lineToRelative(-2.829f, -2.828f)
                curveToRelative(-0.566f, -0.566f, -1.32f, -0.879f, -2.121f, -0.879f)
                horizontalLineToRelative(-7.171f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(16.0f)
                lineTo(21.949f, 5.828f)
                curveToRelative(0.0f, -0.802f, -0.312f, -1.555f, -0.878f, -2.121f)
                close()
                moveTo(19.948f, 18.0f)
                lineTo(7.949f, 18.0f)
                lineTo(7.949f, 3.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(7.171f)
                curveToRelative(0.263f, 0.0f, 0.521f, 0.106f, 0.707f, 0.293f)
                lineToRelative(2.829f, 2.828f)
                curveToRelative(0.188f, 0.188f, 0.292f, 0.439f, 0.292f, 0.707f)
                verticalLineToRelative(12.172f)
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
                moveTo(3.949f, 22.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(2.0f)
                lineTo(1.949f, 24.0f)
                verticalLineToRelative(-14.172f)
                curveToRelative(0.0f, -0.801f, 0.312f, -1.555f, 0.879f, -2.121f)
                lineToRelative(1.121f, -1.121f)
                verticalLineToRelative(15.414f)
                close()
            }
        }
        .build()
        return _simCards!!
    }

private var _simCards: ImageVector? = null
