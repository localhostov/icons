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

public val Icons.Bold.PoliceBox: ImageVector
    get() {
        if (_policeBox != null) {
            return _policeBox!!
        }
        _policeBox = Builder(name = "PoliceBox", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 21.0f)
                lineTo(22.0f, 5.5f)
                curveToRelative(0.0f, -1.521f, -1.14f, -2.802f, -2.649f, -2.979f)
                lineToRelative(-5.851f, -0.688f)
                lineTo(13.5f, 0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.832f)
                lineToRelative(-5.85f, 0.688f)
                curveToRelative(-1.511f, 0.178f, -2.65f, 1.458f, -2.65f, 2.979f)
                verticalLineToRelative(15.5f)
                lineTo(0.0f, 20.999f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(5.001f, 6.0f)
                horizontalLineToRelative(13.999f)
                verticalLineToRelative(15.0f)
                lineTo(5.0f, 21.0f)
                lineTo(5.0f, 6.0f)
                close()
                moveTo(7.001f, 13.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(9.001f, 11.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(11.001f, 8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(17.001f, 8.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _policeBox!!
    }

private var _policeBox: ImageVector? = null
