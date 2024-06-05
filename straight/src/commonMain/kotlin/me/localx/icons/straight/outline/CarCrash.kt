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

public val Icons.Outline.CarCrash: ImageVector
    get() {
        if (_carCrash != null) {
            return _carCrash!!
        }
        _carCrash = Builder(name = "CarCrash", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.956f, 14.354f)
                lineTo(23.52f, 9.262f)
                arcToRelative(2.984f, 2.984f, 0.0f, false, false, -1.891f, -2.535f)
                lineToRelative(-6.455f, -2.5f)
                arcToRelative(2.987f, 2.987f, 0.0f, false, false, -3.106f, 0.55f)
                lineTo(8.256f, 8.185f)
                arcTo(12.07f, 12.07f, 0.0f, false, false, 5.1f, 12.705f)
                lineTo(3.839f, 15.872f)
                lineTo(5.7f, 16.6f)
                lineTo(4.96f, 18.465f)
                lineToRelative(4.647f, 1.847f)
                lineToRelative(0.747f, -1.88f)
                lineToRelative(5.028f, 1.976f)
                lineToRelative(-0.731f, 1.839f)
                lineTo(19.3f, 24.092f)
                lineToRelative(0.737f, -1.855f)
                lineToRelative(1.861f, 0.732f)
                lineToRelative(1.255f, -3.159f)
                arcTo(12.068f, 12.068f, 0.0f, false, false, 23.956f, 14.354f)
                close()
                moveTo(13.4f, 6.272f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.044f, -0.18f)
                lineToRelative(6.455f, 2.5f)
                arcToRelative(0.991f, 0.991f, 0.0f, false, true, 0.628f, 0.843f)
                lineToRelative(0.426f, 4.96f)
                lineTo(9.7f, 9.581f)
                close()
                moveTo(21.293f, 19.072f)
                lineTo(20.774f, 20.379f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(0.0f)
                lineToRelative(-4.647f, -1.846f)
                lineToRelative(-0.008f, 0.02f)
                lineToRelative(-9.681f, -3.8f)
                lineToRelative(0.517f, -1.3f)
                arcToRelative(10.036f, 10.036f, 0.0f, false, true, 1.28f, -2.287f)
                lineToRelative(1.54f, 0.6f)
                lineTo(9.4f, 12.7f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.859f, 0.738f)
                lineToRelative(0.375f, -0.944f)
                lineToRelative(6.89f, 2.7f)
                lineToRelative(-0.363f, 0.914f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.859f, 0.739f)
                lineToRelative(0.366f, -0.922f)
                lineToRelative(1.542f, 0.605f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 21.293f, 19.071f)
                close()
                moveTo(3.69f, 11.0f)
                lineTo(-0.081f, 11.0f)
                lineToRelative(2.8f, -3.5f)
                lineTo(-0.081f, 4.0f)
                lineTo(4.0f, 4.0f)
                lineTo(4.0f, -0.032f)
                lineTo(7.5f, 2.723f)
                lineTo(11.0f, -0.081f)
                lineTo(11.0f, 3.053f)
                lineTo(6.923f, 6.693f)
                arcTo(14.064f, 14.064f, 0.0f, false, false, 3.69f, 11.0f)
                close()
            }
        }
        .build()
        return _carCrash!!
    }

private var _carCrash: ImageVector? = null
