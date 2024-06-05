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

public val Icons.Outline.BagSeedling: ImageVector
    get() {
        if (_bagSeedling != null) {
            return _bagSeedling!!
        }
        _bagSeedling = Builder(name = "BagSeedling", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 13.957f)
                verticalLineToRelative(2.043f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.039f)
                curveToRelative(-1.704f, -0.178f, -4.992f, -1.143f, -4.969f, -5.961f)
                curveToRelative(4.469f, 0.0f, 5.612f, 3.315f, 5.969f, 5.0f)
                curveToRelative(0.361f, -1.682f, 1.5f, -5.0f, 6.0f, -5.0f)
                curveToRelative(0.0f, 4.821f, -3.295f, 5.781f, -5.0f, 5.957f)
                close()
                moveTo(22.0f, 19.296f)
                lineToRelative(2.013f, 4.728f)
                lineTo(-0.013f, 24.024f)
                lineToRelative(2.013f, -4.728f)
                lineTo(2.0f, 4.705f)
                lineTo(-0.017f, 0.0f)
                horizontalLineToRelative(24.033f)
                lineToRelative(-2.017f, 4.705f)
                verticalLineToRelative(14.591f)
                close()
                moveTo(3.017f, 2.0f)
                lineToRelative(0.857f, 2.0f)
                horizontalLineToRelative(16.253f)
                lineToRelative(0.857f, -2.0f)
                lineTo(3.017f, 2.0f)
                close()
                moveTo(20.0f, 18.0f)
                lineTo(20.0f, 6.0f)
                lineTo(4.0f, 6.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(16.0f)
                close()
                moveTo(20.987f, 22.024f)
                lineToRelative(-0.861f, -2.024f)
                lineTo(3.874f, 20.0f)
                lineToRelative(-0.861f, 2.024f)
                horizontalLineToRelative(17.975f)
                close()
            }
        }
        .build()
        return _bagSeedling!!
    }

private var _bagSeedling: ImageVector? = null
