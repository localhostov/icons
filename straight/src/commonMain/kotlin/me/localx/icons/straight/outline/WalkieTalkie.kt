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

public val Icons.Outline.WalkieTalkie: ImageVector
    get() {
        if (_walkieTalkie != null) {
            return _walkieTalkie!!
        }
        _walkieTalkie = Builder(name = "WalkieTalkie", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 3.0f)
                horizontalLineToRelative(-7.0f)
                lineTo(12.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(7.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(6.448f)
                curveToRelative(0.0f, 0.905f, 0.311f, 1.792f, 0.876f, 2.499f)
                lineToRelative(1.124f, 1.404f)
                verticalLineToRelative(7.649f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-7.649f)
                lineToRelative(1.124f, -1.404f)
                curveToRelative(0.565f, -0.707f, 0.876f, -1.594f, 0.876f, -2.499f)
                verticalLineToRelative(-6.448f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(20.0f, 12.448f)
                curveToRelative(0.0f, 0.453f, -0.156f, 0.896f, -0.438f, 1.25f)
                lineToRelative(-1.562f, 1.952f)
                verticalLineToRelative(6.351f)
                lineTo(6.0f, 22.001f)
                verticalLineToRelative(-6.351f)
                lineToRelative(-1.562f, -1.952f)
                curveToRelative(-0.282f, -0.354f, -0.438f, -0.797f, -0.438f, -1.25f)
                verticalLineToRelative(-6.448f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(6.448f)
                close()
                moveTo(6.0f, 13.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-6.0f)
                lineTo(6.0f, 7.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(8.0f, 9.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _walkieTalkie!!
    }

private var _walkieTalkie: ImageVector? = null
