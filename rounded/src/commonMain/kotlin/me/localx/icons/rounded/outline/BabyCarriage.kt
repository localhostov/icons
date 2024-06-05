package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.BabyCarriage: ImageVector
    get() {
        if (_babyCarriage != null) {
            return _babyCarriage!!
        }
        _babyCarriage = Builder(name = "BabyCarriage", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 0.0f)
                arcToRelative(1.959f, 1.959f, 0.0f, false, false, -2.0f, 2.0f)
                lineTo(13.0f, 9.0f)
                lineTo(5.468f, 9.0f)
                lineTo(4.229f, 7.512f)
                curveTo(3.48f, 6.459f, 0.292f, 4.933f, 0.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 1.0f, 8.0f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, 1.692f, 0.792f)
                lineTo(4.0f, 10.362f)
                lineTo(4.0f, 11.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                horizontalLineToRelative(2.865f)
                lineToRelative(-2.6f, 3.12f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 1.5f, 1.323f)
                lineTo(14.0f, 16.562f)
                lineToRelative(3.234f, 3.881f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 1.5f, -1.323f)
                lineTo(16.135f, 16.0f)
                lineTo(19.0f, 16.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                lineTo(24.0f, 10.0f)
                curveTo(24.0f, 0.114f, 15.09f, 0.0f, 15.0f, 0.0f)
                close()
                moveTo(21.961f, 9.0f)
                lineTo(15.0f, 9.0f)
                lineToRelative(0.0f, -7.0f)
                arcTo(7.083f, 7.083f, 0.0f, false, true, 21.961f, 9.0f)
                close()
                moveTo(19.0f, 14.0f)
                lineTo(9.0f, 14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                lineTo(22.0f, 11.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 19.0f, 14.0f)
                close()
            }
        }
        .build()
        return _babyCarriage!!
    }

private var _babyCarriage: ImageVector? = null
