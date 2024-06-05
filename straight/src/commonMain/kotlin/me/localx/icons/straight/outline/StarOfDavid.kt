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

public val Icons.Outline.StarOfDavid: ImageVector
    get() {
        if (_starOfDavid != null) {
            return _starOfDavid!!
        }
        _starOfDavid = Builder(name = "StarOfDavid", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.991f, 12.0f)
                lineToRelative(3.5f, -6.0f)
                horizontalLineToRelative(-7.001f)
                lineTo(11.999f, 0.015f)
                lineToRelative(-3.491f, 5.985f)
                lineTo(1.509f, 6.0f)
                lineToRelative(3.5f, 6.0f)
                lineToRelative(-3.5f, 6.0f)
                horizontalLineToRelative(6.999f)
                lineToRelative(3.491f, 5.985f)
                lineToRelative(3.492f, -5.985f)
                horizontalLineToRelative(7.001f)
                lineToRelative(-3.5f, -6.0f)
                close()
                moveTo(19.009f, 8.0f)
                lineToRelative(-1.176f, 2.015f)
                lineToRelative(-1.176f, -2.015f)
                horizontalLineToRelative(2.352f)
                close()
                moveTo(16.675f, 12.0f)
                lineToRelative(-2.334f, 4.0f)
                horizontalLineToRelative(-4.684f)
                lineToRelative(-2.333f, -4.0f)
                lineToRelative(2.333f, -4.0f)
                horizontalLineToRelative(4.684f)
                lineToRelative(2.334f, 4.0f)
                close()
                moveTo(11.999f, 3.985f)
                lineToRelative(1.176f, 2.015f)
                horizontalLineToRelative(-2.351f)
                lineToRelative(1.175f, -2.015f)
                close()
                moveTo(4.991f, 8.0f)
                horizontalLineToRelative(2.351f)
                lineToRelative(-1.175f, 2.015f)
                lineToRelative(-1.176f, -2.015f)
                close()
                moveTo(4.991f, 16.0f)
                lineToRelative(1.176f, -2.015f)
                lineToRelative(1.175f, 2.015f)
                horizontalLineToRelative(-2.351f)
                close()
                moveTo(11.999f, 20.015f)
                lineToRelative(-1.175f, -2.015f)
                horizontalLineToRelative(2.351f)
                lineToRelative(-1.176f, 2.015f)
                close()
                moveTo(17.833f, 13.985f)
                lineToRelative(1.176f, 2.015f)
                horizontalLineToRelative(-2.352f)
                lineToRelative(1.176f, -2.015f)
                close()
            }
        }
        .build()
        return _starOfDavid!!
    }

private var _starOfDavid: ImageVector? = null
