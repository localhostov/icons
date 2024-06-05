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

public val Icons.Outline.Shuttlecock: ImageVector
    get() {
        if (_shuttlecock != null) {
            return _shuttlecock!!
        }
        _shuttlecock = Builder(name = "Shuttlecock", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.432f, 12.565f)
                curveToRelative(-0.081f, -0.1f, -0.8f, -1.013f, -1.259f, -1.468f)
                arcToRelative(3.323f, 3.323f, 0.0f, false, false, -1.367f, -0.8f)
                arcToRelative(3.129f, 3.129f, 0.0f, false, false, -0.723f, -3.287f)
                lineTo(20.073f, 7.0f)
                lineToRelative(-0.01f, -0.01f)
                arcToRelative(3.158f, 3.158f, 0.0f, false, false, -2.14f, -0.912f)
                arcToRelative(3.171f, 3.171f, 0.0f, false, false, -4.238f, -2.9f)
                arcTo(3.172f, 3.172f, 0.0f, false, false, 12.9f, 1.827f)
                curveTo(12.448f, 1.372f, 11.537f, 0.649f, 11.435f, 0.568f)
                lineToRelative(-0.7f, -0.551f)
                lineToRelative(-0.629f, 0.629f)
                curveTo(5.758f, 5.0f, 4.144f, 9.9f, 3.076f, 14.56f)
                lineTo(1.333f, 16.3f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 7.7f, 22.667f)
                lineTo(9.44f, 20.925f)
                curveToRelative(4.665f, -1.069f, 9.566f, -2.683f, 13.914f, -7.032f)
                lineToRelative(0.629f, -0.63f)
                close()
                moveTo(16.993f, 8.421f)
                arcToRelative(1.213f, 1.213f, 0.0f, false, true, 1.666f, -0.009f)
                arcToRelative(1.182f, 1.182f, 0.0f, false, true, -0.01f, 1.665f)
                horizontalLineToRelative(0.0f)
                arcToRelative(43.486f, 43.486f, 0.0f, false, true, -5.744f, 4.413f)
                lineToRelative(-0.991f, -0.991f)
                lineToRelative(5.079f, -5.079f)
                close()
                moveTo(13.9f, 5.331f)
                horizontalLineToRelative(0.0f)
                arcTo(1.185f, 1.185f, 0.0f, false, true, 15.582f, 7.0f)
                lineTo(10.5f, 12.086f)
                lineTo(9.49f, 11.075f)
                arcTo(43.493f, 43.493f, 0.0f, false, true, 13.9f, 5.331f)
                close()
                moveTo(10.9f, 2.712f)
                curveToRelative(0.227f, 0.191f, 0.451f, 0.388f, 0.592f, 0.529f)
                arcToRelative(1.265f, 1.265f, 0.0f, false, true, 0.01f, 1.744f)
                lineToRelative(0.006f, 0.006f)
                arcTo(52.45f, 52.45f, 0.0f, false, false, 8.047f, 9.633f)
                lineToRelative(-1.0f, -1.0f)
                arcTo(21.471f, 21.471f, 0.0f, false, true, 10.9f, 2.712f)
                close()
                moveTo(6.283f, 21.253f)
                arcToRelative(2.561f, 2.561f, 0.0f, false, true, -3.536f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, -3.536f)
                lineToRelative(1.278f, -1.278f)
                lineToRelative(3.536f, 3.536f)
                close()
                moveTo(9.311f, 18.9f)
                lineTo(5.1f, 14.689f)
                arcToRelative(39.389f, 39.389f, 0.0f, false, true, 1.145f, -4.027f)
                lineToRelative(7.09f, 7.09f)
                arcTo(39.389f, 39.389f, 0.0f, false, true, 9.311f, 18.9f)
                close()
                moveTo(15.365f, 16.954f)
                lineTo(14.348f, 15.937f)
                arcToRelative(52.214f, 52.214f, 0.0f, false, false, 4.705f, -3.511f)
                arcToRelative(1.084f, 1.084f, 0.0f, false, true, 0.807f, -0.293f)
                arcToRelative(1.339f, 1.339f, 0.0f, false, true, 0.9f, 0.381f)
                curveToRelative(0.141f, 0.142f, 0.338f, 0.366f, 0.529f, 0.593f)
                arcTo(21.471f, 21.471f, 0.0f, false, true, 15.365f, 16.951f)
                close()
            }
        }
        .build()
        return _shuttlecock!!
    }

private var _shuttlecock: ImageVector? = null
