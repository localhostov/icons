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

public val Icons.Filled.WalkieTalkie: ImageVector
    get() {
        if (_walkieTalkie != null) {
            return _walkieTalkie!!
        }
        _walkieTalkie = Builder(name = "WalkieTalkie", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 11.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(22.0f, 6.0f)
                verticalLineToRelative(6.448f)
                curveToRelative(0.0f, 0.905f, -0.311f, 1.792f, -0.876f, 2.499f)
                lineToRelative(-1.124f, 1.404f)
                verticalLineToRelative(7.649f)
                lineTo(4.0f, 24.0f)
                verticalLineToRelative(-7.649f)
                lineToRelative(-1.124f, -1.404f)
                curveToRelative(-0.565f, -0.707f, -0.876f, -1.594f, -0.876f, -2.499f)
                verticalLineToRelative(-6.448f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                lineTo(5.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                lineTo(10.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(18.0f, 7.0f)
                lineTo(6.0f, 7.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-6.0f)
                close()
            }
        }
        .build()
        return _walkieTalkie!!
    }

private var _walkieTalkie: ImageVector? = null
