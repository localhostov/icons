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

public val Icons.Outline.HeartArrow: ImageVector
    get() {
        if (_heartArrow != null) {
            return _heartArrow!!
        }
        _heartArrow = Builder(name = "HeartArrow", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 18.0f)
                verticalLineToRelative(2.586f)
                lineToRelative(-3.06f, -3.06f)
                curveTo(21.063f, 15.281f, 23.0f, 12.534f, 23.0f, 9.95f)
                arcTo(5.745f, 5.745f, 0.0f, false, false, 17.5f, 4.0f)
                arcTo(5.913f, 5.913f, 0.0f, false, false, 13.0f, 6.47f)
                arcTo(5.912f, 5.912f, 0.0f, false, false, 8.5f, 4.0f)
                arcToRelative(5.113f, 5.113f, 0.0f, false, false, -2.453f, 0.633f)
                lineTo(1.414f, 0.0f)
                lineTo(0.0f, 1.414f)
                lineTo(4.484f, 5.9f)
                arcTo(6.187f, 6.187f, 0.0f, false, false, 3.0f, 9.95f)
                curveToRelative(0.0f, 5.4f, 8.458f, 11.547f, 9.422f, 12.23f)
                lineToRelative(0.578f, 0.409f)
                lineToRelative(0.578f, -0.409f)
                arcToRelative(40.353f, 40.353f, 0.0f, false, false, 3.943f, -3.245f)
                lineTo(20.586f, 22.0f)
                lineTo(18.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(24.0f, 18.0f)
                close()
                moveTo(13.0f, 20.129f)
                curveTo(9.042f, 17.2f, 5.0f, 12.915f, 5.0f, 9.95f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 8.5f, 6.0f)
                curveToRelative(2.2f, 0.0f, 3.593f, 2.7f, 3.605f, 2.72f)
                lineTo(13.0f, 10.492f)
                lineToRelative(0.9f, -1.769f)
                curveTo(13.907f, 8.7f, 15.3f, 6.0f, 17.5f, 6.0f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 21.0f, 9.95f)
                curveTo(21.0f, 12.914f, 16.957f, 17.2f, 13.0f, 20.129f)
                close()
            }
        }
        .build()
        return _heartArrow!!
    }

private var _heartArrow: ImageVector? = null
