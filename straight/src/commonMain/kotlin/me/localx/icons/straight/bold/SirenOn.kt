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

public val Icons.Bold.SirenOn: ImageVector
    get() {
        if (_sirenOn != null) {
            return _sirenOn!!
        }
        _sirenOn = Builder(name = "SirenOn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.563f, 19.165f)
                lineToRelative(-1.246f, -9.224f)
                curveToRelative(-0.281f, -2.247f, -2.201f, -3.941f, -4.465f, -3.941f)
                horizontalLineToRelative(-7.703f)
                curveToRelative(-2.264f, 0.0f, -4.184f, 1.694f, -4.463f, 3.927f)
                lineToRelative(-1.248f, 9.238f)
                curveToRelative(-1.412f, 0.451f, -2.437f, 1.776f, -2.437f, 3.335f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -1.559f, -1.025f, -2.884f, -2.437f, -3.335f)
                close()
                moveTo(8.149f, 9.0f)
                horizontalLineToRelative(7.703f)
                curveToRelative(0.755f, 0.0f, 1.395f, 0.565f, 1.491f, 1.329f)
                lineToRelative(1.171f, 8.671f)
                lineTo(5.486f, 19.0f)
                lineToRelative(1.173f, -8.686f)
                curveToRelative(0.094f, -0.75f, 0.734f, -1.314f, 1.489f, -1.314f)
                close()
                moveTo(2.791f, 6.679f)
                lineTo(0.043f, 4.048f)
                lineTo(2.119f, 1.881f)
                lineToRelative(2.747f, 2.631f)
                lineToRelative(-2.075f, 2.167f)
                close()
                moveTo(5.959f, 4.196f)
                lineToRelative(-0.538f, -3.792f)
                lineTo(8.391f, -0.018f)
                lineToRelative(0.538f, 3.792f)
                lineToRelative(-2.971f, 0.422f)
                close()
                moveTo(11.072f, 15.0f)
                horizontalLineToRelative(-3.027f)
                lineToRelative(0.365f, -2.701f)
                curveToRelative(0.1f, -0.744f, 0.735f, -1.299f, 1.486f, -1.299f)
                horizontalLineToRelative(2.104f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-0.793f)
                lineToRelative(-0.135f, 1.0f)
                close()
                moveTo(21.21f, 6.679f)
                lineToRelative(-2.075f, -2.167f)
                lineToRelative(2.747f, -2.631f)
                lineToRelative(2.075f, 2.167f)
                lineToRelative(-2.747f, 2.631f)
                close()
                moveTo(18.042f, 4.196f)
                lineToRelative(-2.971f, -0.422f)
                lineTo(15.609f, -0.018f)
                lineToRelative(2.971f, 0.422f)
                lineToRelative(-0.538f, 3.792f)
                close()
            }
        }
        .build()
        return _sirenOn!!
    }

private var _sirenOn: ImageVector? = null
