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

public val Icons.Outline.SocialNetwork: ImageVector
    get() {
        if (_socialNetwork != null) {
            return _socialNetwork!!
        }
        _socialNetwork = Builder(name = "SocialNetwork", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.021f, 7.0f)
                lineToRelative(0.336f, -2.041f)
                arcToRelative(3.044f, 3.044f, 0.0f, false, false, -4.208f, -3.287f)
                arcTo(3.139f, 3.139f, 0.0f, false, false, 9.582f, 3.225f)
                lineTo(7.717f, 7.0f)
                lineTo(3.0f, 7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                lineTo(22.018f, 22.0f)
                lineTo(24.0f, 10.963f)
                lineTo(24.016f, 7.0f)
                close()
                moveTo(2.0f, 19.0f)
                lineTo(2.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 9.0f)
                lineTo(7.0f, 9.0f)
                lineTo(7.0f, 20.0f)
                lineTo(3.0f, 20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.0f, 19.0f)
                close()
                moveTo(22.0f, 10.7f)
                lineTo(20.33f, 20.0f)
                lineTo(9.0f, 20.0f)
                lineTo(9.0f, 8.909f)
                lineToRelative(2.419f, -4.9f)
                arcTo(1.07f, 1.07f, 0.0f, false, true, 13.141f, 3.8f)
                arcToRelative(1.024f, 1.024f, 0.0f, false, true, 0.233f, 0.84f)
                lineTo(12.655f, 9.0f)
                lineTo(22.0f, 9.0f)
                close()
            }
        }
        .build()
        return _socialNetwork!!
    }

private var _socialNetwork: ImageVector? = null
