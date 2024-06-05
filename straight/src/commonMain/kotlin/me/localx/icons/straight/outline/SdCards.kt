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

public val Icons.Outline.SdCards: ImageVector
    get() {
        if (_sdCards != null) {
            return _sdCards!!
        }
        _sdCards = Builder(name = "SdCards", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 0.0f)
                horizontalLineToRelative(-7.171f)
                curveToRelative(-0.801f, 0.0f, -1.555f, 0.312f, -2.122f, 0.879f)
                lineToRelative(-2.828f, 2.828f)
                curveToRelative(-0.567f, 0.566f, -0.879f, 1.32f, -0.879f, 2.121f)
                verticalLineToRelative(14.172f)
                horizontalLineToRelative(16.0f)
                lineTo(22.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(20.0f, 18.0f)
                horizontalLineToRelative(-12.0f)
                lineTo(8.0f, 5.828f)
                curveToRelative(0.0f, -0.263f, 0.107f, -0.521f, 0.293f, -0.707f)
                lineToRelative(2.828f, -2.828f)
                curveToRelative(0.189f, -0.188f, 0.44f, -0.293f, 0.708f, -0.293f)
                horizontalLineToRelative(7.171f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(15.0f)
                close()
                moveTo(4.0f, 22.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 24.0f)
                verticalLineToRelative(-14.172f)
                curveToRelative(0.0f, -0.801f, 0.312f, -1.555f, 0.879f, -2.121f)
                lineToRelative(1.121f, -1.121f)
                verticalLineToRelative(15.414f)
                close()
                moveTo(10.0f, 6.242f)
                lineToRelative(2.0f, -2.0f)
                verticalLineToRelative(2.758f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-0.758f)
                close()
                moveTo(16.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(13.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _sdCards!!
    }

private var _sdCards: ImageVector? = null
