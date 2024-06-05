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

public val Icons.Filled.WatchSmart: ImageVector
    get() {
        if (_watchSmart != null) {
            return _watchSmart!!
        }
        _watchSmart = Builder(name = "WatchSmart", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 22.0f)
                curveToRelative(0.342f, 0.0f, 0.677f, -0.035f, 1.0f, -0.101f)
                verticalLineToRelative(2.101f)
                lineTo(6.0f, 24.0f)
                verticalLineToRelative(-2.101f)
                curveToRelative(0.323f, 0.066f, 0.658f, 0.101f, 1.0f, 0.101f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(17.0f, 2.0f)
                curveToRelative(0.342f, 0.0f, 0.677f, 0.035f, 1.0f, 0.101f)
                lineTo(18.0f, 0.0f)
                lineTo(6.0f, 0.0f)
                verticalLineToRelative(2.101f)
                curveToRelative(0.323f, -0.066f, 0.658f, -0.101f, 1.0f, -0.101f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(20.0f, 7.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(7.0f, 20.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(4.0f, 7.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(15.707f, 14.293f)
                lineToRelative(-2.707f, -2.707f)
                verticalLineToRelative(-4.586f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.414f)
                lineToRelative(3.293f, 3.293f)
                lineToRelative(1.414f, -1.414f)
                close()
            }
        }
        .build()
        return _watchSmart!!
    }

private var _watchSmart: ImageVector? = null
